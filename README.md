# GeneralThirdLoginShare
通用三方登录

## gradle使用：

一、Project下的build.gradle文件下添加

allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}

二、Module下的build.gradle文件下添加

dependencies {
          compile 'com.github.Lvluffy:GeneralThirdLoginShare:1.0.0'
}

或者

dependencies {
          implementation 'com.github.Lvluffy:GeneralThirdLoginShare:1.0.0'
}

## 录屏
![qvju8-nlo9z](https://user-images.githubusercontent.com/34730376/56401395-3030ee00-628b-11e9-8cab-20679aef85fb.gif)
