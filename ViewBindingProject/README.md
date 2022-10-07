# Android ViewBinding
 Android ViewBinding

- ### ViewBinding

ViewBinding mainly used for binding Views like textView, editText... Viewbinding can replace `findViewById()`. Once view binding is enabled in module `build.gradle`. It generating binding class for each **XML Layouts**.

```groovy
android {
	buildFeatures {
		viewBinding true
	}
}
```

Also use `tools:viewBindingIgnore="true"` tag to ignore binding spacific layout file
```xml
<LinearLayout
	tools: viewBindingIgnore="true">
	...
		
</LinearLayout>
```

Generated binding class file naming in `Pascal Case`

`result_profile.xml`  --> **ResultProfileBinding**
`activity_main.xml` --> **ActivityMainBinding**

***
- ### Use view binding in activities

To set up an instance of the binding class for use with an activity, perform the following steps in the activity's [`onCreate()`](https://developer.android.com/reference/kotlin/android/app/Activity#oncreate) method:

1.  Call the static `inflate()` method included in the generated binding class. This creates an instance of the binding class for the activity to use.
2.  Get a reference to the root view by either calling the `getRoot()` method or using [Kotlin property syntax](https://kotlinlang.org/docs/reference/properties.html#declaring-properties).
3.  Pass the root view to [`setContentView()`](https://developer.android.com/reference/kotlin/android/app/Activity#setcontentview_1) to make it the active view on the screen.

```kotlin
private lateinit var binding: FileNameHereBinding

override onCreate(savedInstanceState: Bundle?){
	super.onCreate(savedInstanceState)
	binding = FileNameHereBinding.inflate(layoutInflater)
	setContentView(binding.root)
}
```
