# AndroidHideApi

导出Android隐藏的API.

---
使用:

**Gradle**:

- `Android` 原生系统相关：
``` groovy
dependencies {
    compile 'com.rover12421.AndroidHideApi:android:1.17'
}
```

- `HuaWei` 华为自定义相关(不一定所有huawei手机都有)：
``` groovy
dependencies {
    compile 'com.rover12421.AndroidHideApi:huawei:1.4'
}
```

- `MTK` MTK 手机自定义相关(不一定又有MTK的都有)：
``` groovy
dependencies {
    compile 'com.rover12421.AndroidHideApi:mediatek:1.4'
}
```

---

如果没法下载最新版本，可以使用 `sonatype oss` 仓库

``` groovy
repositories {
    maven { url 'https://oss.sonatype.org/service/local/repositories/releases/content/' }
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
    androidHideApi 'com.rover12421.AndroidHideApi:android:1.17'
    compileOnly 'com.rover12421.AndroidHideApi:android:1.17'
}

ext {
    androidHideApiPath = configurations.androidHideApi.asPath
}

tasks.withType(JavaCompile) {
    options.compilerArgs.add("-Xbootclasspath/p:${androidHideApiPath}")
}
```

- 解决`IDEA`或`Android Studio`编译问题
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
        def androidHideOrderEntry = orderEntries.find { it.@type == 'library' && it.@name.startsWith('Gradle: android-') }

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