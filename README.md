# Font Awesome Example App
Here you can check and use any code from completly working project - Android Font Awesome Icons Application for version 4 and 5 of Font Awesome.

![main screen](https://github.com/Deniard18/font-awesome-app/blob/master/app/src/main/res/mipmap-xxxhdpi/main_screen_exmpl.png)

# Old version_4 Of Font Awesome
File is named fa_version_4.ttf and is placed inside of res/font folder of current project.

# How to use
For version 4 or older of Font Awesome, just copy code from FontAwesomeIconV4.kt and also copy fa_version_4.ttf to you project. And now you can use it in your project.

For version 5 or newer, download last version of Font Awesome from official website and import .ttf files to your project. Also copy FontAwesomeIconV5.kt to your project. And now you can use it in your project.

# Example of usage both for version 4 and 5
```xml
    <com.example.fontawesomeapp.FontAwesomeIconV4
        android:id="@+id/fa_instagram"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="&#xf16d;"
        android:textSize="28sp"
        android:textColor="#DE2D49" />

    <com.example.fontawesomeapp.FontAwesomeIconV5
        android:id="@+id/fa_facebook"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="&#xf082;"
        android:textSize="28sp"
        android:textColor="#165CCF"
        app:brand_icon="true" />
```
