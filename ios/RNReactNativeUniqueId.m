
#import "RNReactNativeUniqueId.h"
#import <UIKit/UIKit.h>

@implementation RNReactNativeUniqueId

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE();

RCT_REMAP_METHOD(getIMEI,
                 getIMEIWithResolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    resolve(nil);
}

RCT_REMAP_METHOD(getUiniqueId,
                 getUiniqueIdWithResolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    UIDevice *device = [UIDevice currentDevice];
    NSString  *currentDeviceId = [[device identifierForVendor]UUIDString];
    resolve(currentDeviceId);
}

@end

