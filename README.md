# Font Awesome Example App
Here you can chech and use any code from completly working project. Android Font Awesome Icons for version 4 and 5.

![main screen](https://github.com/Deniard18/font-awesome-app/blob/master/app/src/main/res/mipmap-xxxhdpi/main_screen_exmpl.png)

# How to use
For version 4 or older of Font Awesome, just copy code from FontAwesomeIconV4.kt and also copy fa_version_4 to you project. That's it.

For version 5 or newer, download last version of Font Awesome from official website and import .ttf files to your project. Also copy FontAwesomeIconV5.kt to your project. And now you can use it.

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
