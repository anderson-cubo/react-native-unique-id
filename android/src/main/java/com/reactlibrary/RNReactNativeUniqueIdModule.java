
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.content.Context;

public class RNReactNativeUniqueIdModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeUniqueIdModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  private String _getIMEI() {
    TelephonyManager telephonyManager = (TelephonyManager) this.reactContext.getCurrentActivity()
            .getSystemService(Context.TELEPHONY_SERVICE);
    return telephonyManager.getDeviceId();
  }

  private String _getDeviceUniqueID(){
    String device_unique_id = Secure.getString(this.reactContext.getCurrentActivity().getContentResolver(),
            Secure.ANDROID_ID);
    return device_unique_id;
  }

  @ReactMethod
  public void getIMEI (Promise promise) {
    promise.resolve(this._getIMEI());
  }

  @ReactMethod
  public void getUiniqueId (Promise promise) {
    promise.resolve(this._getDeviceUniqueID());
  }

  @Override
  public String getName() {
    return "RNReactNativeUniqueId";
  }
}
