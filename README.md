# GoodPrefs
GoodPrefs is An Android library for easy access to Android Shared preferences<br>
## Install library
* ### Gradle
Add jitpack.io to your root gradle file (project level) :
```
allprojects {
 	repositories {
 		...
 		maven { url 'https://jitpack.io' }
 	}
 }
 ```
 Add the dependency in your app build.gradle
 ```
dependencies {
   implementation 'com.github.MrNouri:GoodPrefs:1.0'
}
 ```
### You have to initialize the GoodPrefs library inside your application class :
 ```
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GoodPrefs.init(getApplicationContext());
    }
}
 ```
### Usage
#### Saving Values
 ```
GoodPrefs.getInstance().saveInt(key,value); // For saving Integer value
GoodPrefs.getInstance().saveFloat(key,value); // For saving Float value

// And so on for other types.

//For Objects and Lists of Objects
GoodPrefs.getInstance().saveObject(key,customObject); // For Saving Custom Object

GoodPrefs.getInstance().saveObjectList(key,listOfCustomObjects); // For Saving Custom Objects List
 ```
#### Getting Values
 ```
GoodPrefs.getInstance().getInt(key,defaultValue); // For Getting Integer value
GoodPrefs.getInstance().getFloat(key,defaultValue); // For Getting Float value

// And so on for other types.

//For Objects and Lists of Objects
GoodPrefs.getInstance().getObject(key,classType); // For Getting Custom Object

GoodPrefs.getInstance().getObject(key,Person.class); // assuming your custom class called Person

GoodPrefs.getInstance().getObjectList(key,classType); // For Getting Custom Objects List
 ```
#### Deleting Values
 ```
//Remove element by Key
GoodPrefs.getInstance().deleteValue(key)

//clear all sharedPrefereces
GoodPrefs.getInstance().clearSession();
 ```
#### Utils
 ```
//Check Key exists or not
boolean isExists = GoodPrefs.getInstance().isKeyExists(key)
 ```
 
I hope this library will help you
