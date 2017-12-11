
# react-native-unique-id

## Getting started

`$ npm install react-native-unique-id --save`

### Mostly automatic installation

`$ react-native link react-native-unique-id`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-unique-id` and add `RNReactNativeUniqueId.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeUniqueId.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeUniqueIdPackage;` to the imports at the top of the file
  - Add `new RNReactNativeUniqueIdPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-unique-id'
  	project(':react-native-unique-id').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-unique-id/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-unique-id')
  	```

## Usage
```javascript
import UniqueId from 'react-native-unique-id';

Promise => UniqueId.getIMEI()
Promise => UniqueId.getUniqueId()
```
  