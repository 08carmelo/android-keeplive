# android-keeplive
Improve the android service process priority
# Gradle
```groovy
compile 'com.carmelo:keeplive:1.0.0'
```

# 如何使用
```java
public class DemoService extends KeepliveService{
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int i = super.onStartCommand(intent, flags, startId);
        //do something
        return i;
    }
}
```
在manifest.xml注册service并且指定进程为 :live
```java
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.carmelo.androidkeeplive">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <service android:name=".DemoService"
            android:process=":live"/>
    </application>

</manifest>
```

如果你不想extends KeepliveService, 你可以自定义任何Service，然后参考KeepliveService调用KeepLiveManager的方法来实现。

# Blog
https://www.jianshu.com/p/53c4d8303e19

License
-------
    Copyright (c) 2018 Zetra.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
