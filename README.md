# Rippale Effect Lib


<img src="https://github.com/premsingh8171/rippale_effect_lib/blob/master/app/src/main/res/drawable/image.gif" width="300" height="550" />

<h2>How to integrate the library in your app?</h2>
<b>Gradle dependency</b></br>

```gradle
dependencies {

	        implementation 'com.github.premsingh8171:rippale_effect_lib:1.0.3'
}
```

<b>Dependency</b></br>
```gradle
allprojects {
		repositories {
    
                 maven { url 'https://jitpack.io' }
                 
		}
	}
```
```xml
 <com.premsinghdaksha.rippale_effect_lib.RippleEffectView
        android:id="@+id/rippaleEffect_Id"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_margin="20dp"
        ripple:rv_centered="true">
    </com.premsinghdaksha.rippale_effect_lib.RippleEffectView>
```
```java
RippleEffectView effectView = findViewById(R.id.rippaleEffect_Id);
        effectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "RippaleEffect", Toast.LENGTH_LONG);
            }
        });
```

#version- 1.0, 1.0.1, 1.0.2

<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
