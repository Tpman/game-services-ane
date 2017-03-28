/**
 * Copyright 2017 Marcel Piestansky (http://marpies.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#import <AIRExtHelpers/FlashRuntimeExtensions.h>
#import <Foundation/Foundation.h>

@interface GameServices : NSObject

+ (void) dispatchEvent:(const NSString*) eventName;
+ (void) dispatchEvent:(const NSString*) eventName withMessage:(NSString*) message;
+ (void) log:(const NSString*) message;
+ (void) showLogs:(BOOL) showLogs;

@end