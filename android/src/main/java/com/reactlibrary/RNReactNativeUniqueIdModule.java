
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class RNReactNativeUniqueIdModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeUniqueIdModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  private String _getIMEI(Activity activity) {
    TelephonyManager telephonyManager = (TelephonyManager) activity
            .getSystemService(Context.TELEPHONY_SERVICE);
    return telephonyManager.getDeviceId();
  }

  private String _getDeviceUniqueID(Activity activity){
    String device_unique_id = Secure.getString(activity.getContentResolver(),
            Secure.ANDROID_ID);
    return device_unique_id;
  }

  @ReactMethod
  public getIMEI (Promise promise) {
    promise.resolve(this._getIMEI());
  }

  @ReactMethod
  public getUiniqueId (Promise promise) {
    promise.resolve(this._getDeviceUniqueID());
  }

  @Override
  public String getName() {
    return "RNReactNativeUniqueId";
  }
}