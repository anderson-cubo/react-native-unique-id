using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Unique.Id.RNReactNativeUniqueId
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeUniqueIdModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeUniqueIdModule"/>.
        /// </summary>
        internal RNReactNativeUniqueIdModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeUniqueId";
            }
        }
    }
}
