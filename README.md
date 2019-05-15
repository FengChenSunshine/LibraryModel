# 数据模型基类库[![](https://jitpack.io/v/FengChenSunshine/LibraryModel.svg)](https://jitpack.io/#FengChenSunshine/LibraryModel)
[![](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/FengChenSunshine/LibraryModel/blob/master/LICENSE)

这个库里包含项目中数据模型的父类，项目中的其它所有数据模型都必须继承子该类！！！

How to
Step 1. Add the JitPack repository to your build file,Add it in your root build.gradle at the end of repositories:

    allprojects {
		    repositories {
			      ...
			      maven { url 'https://jitpack.io' }
		    }
	  }

Step 2. Add the dependency

    dependencies {
	          implementation 'com.github.FengChenSunshine:LibraryModel:Tag'
	  }
