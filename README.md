# AndroidHideApi

本项目是用来发布 Android 完整版本的 SDK 的.

---
> 子项目(artifactId)在 AOSP 的对应关系

artifactId          | AOSP 位置
--------------------|------------------
framework           | out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/classes-header.jar
libart              | out/target/common/obj/JAVA_LIBRARIES/core-libart.com.android.art.release_intermediates/classes.jar
libcore             | out/soong/.intermediates/libcore/core-all-system-modules/android_common/modules/module.jar

---

`android` 项目是aar模式,包含aidl文件,如需要aild请使用这个版本.不需要aidl,建议使用 `framework` 项目.
`libcore` 包含`sun`包的部分类.比如`Unsafe`

---

> 使用:

**Gradle**:

- 引用 android Q 的  `framework`,可以替换 `Android SDK` 中的 `android.jar`
``` groovy
dependencies {
    compile 'com.rover12421.android.hide:framework:11.0.0_r17'
}
```

如果没法下载最新版本，可以使用 `sonatype oss` 仓库

``` groovy
repositories {
    maven { 
        url 'https://oss.sonatype.org/service/local/repositories/releases/content/' 
    }
}
```

---

如果想使用和SDK中`android.jar`冲突的类，可以使用下面的方法

- 解决`gradle`build问题
``` groovy
configurations {
    androidHideApi
}

dependencies {
    androidHideApi 'com.rover12421.AndroidHideApi:framework:11.0.0_r17'
    compileOnly 'com.rover12421.AndroidHideApi:framework:11.0.0_r17'
}

ext {
    androidHideApiPath = configurations.androidHideApi.asPath
}

tasks.withType(JavaCompile) {
    options.compilerArgs.add("-Xbootclasspath/p:${androidHideApiPath}")
}
```

> 解决`IDEA`或`Android Studio`编译问题

- **注1** | 新版IDEA生成的`iml`文件没有`orderEntry`节点。如果不能生效请使用`Android Studio`
- **注2** | 最新的 `Android Studio` 虽然可以修改 `orderEntry`, 但是IDE中顺序还是以原生 SDK 优先. `Gradle` 编译没有问题


``` groovy
task fixIml {
    ext.imlFile = projectDir.absolutePath + '/' + project.name + '.iml'
    inputs.file imlFile
    outputs.file imlFile

    doLast {
        if (!file(imlFile).exists())
            return

        // Parse the existing iml file
        def parse = new XmlParser().parse(imlFile)
        def moduleComponent = parse.component.find { it.@name == 'NewModuleRootManager' }

        def orderEntries = moduleComponent.orderEntry

        def jdkOrderEntry = orderEntries.find { it.@type == 'jdk' }
        def androidHideOrderEntry = orderEntries.find { it.@type == 'library' && it.@name.startsWith('Gradle: com.rover12421.AndroidHideApi:framework') }

        if (androidHideOrderEntry != null) {
            moduleComponent.children().remove(androidHideOrderEntry)
            def jdkOrderEntryIndex = moduleComponent.children().indexOf(jdkOrderEntry)
            moduleComponent.children().add(jdkOrderEntryIndex, androidHideOrderEntry)
        }

        // Write the fixed iml file
        def printer = new XmlNodePrinter(new PrintWriter(new FileWriter(imlFile)))
        printer.preserveWhitespace = true
        printer.print(parse)
    }
}

tasks.preBuild.dependsOn fixIml
```