# AndroidHideApi

导出Android隐藏的API.

---
使用:

**Gradle**:

- `Android` 原生系统相关：
``` groovy
dependencies {
    compile 'com.rover12421.AndroidHideApi:android:1.15'
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


**Maven**:

- `Android` 原生系统相关：
``` xml
<dependency>
    <groupId>com.rover12421.AndroidHideApi</groupId>
    <artifactId>android</artifactId>
    <version>1.15</version>
</dependency>
```

- `HuaWei` 华为自定义相关(不一定所有huawei手机都有)：
``` xml
<dependency>
    <groupId>com.rover12421.AndroidHideApi</groupId>
    <artifactId>huawei</artifactId>
    <version>1.4</version>
</dependency>
```

- `MTK` MTK 手机自定义相关(不一定又有MTK的都有)：
``` xml
<dependency>
    <groupId>com.rover12421.AndroidHideApi</groupId>
    <artifactId>mediatek</artifactId>
    <version>1.4</version>
</dependency>
```

---

如果没法下载最新版本，可以使用 `sonatype oss` 仓库

``` groovy
repositories {
    maven { url 'https://oss.sonatype.org/service/local/repositories/releases/content/' }
}
```
