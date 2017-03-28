/*
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

package com.marpies.ane.gameservices.functions.achievements;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREObject;
import com.marpies.ane.gameservices.events.GameServicesEvent;
import com.marpies.ane.gameservices.functions.BaseFunction;
import com.marpies.ane.gameservices.utils.AIR;

public class ResetAchievementsFunction extends BaseFunction {

	@Override
	public FREObject call( FREContext context, FREObject[] args ) {
		super.call( context, args );

		// todo https://developers.google.com/games/services/management/api/achievements/resetAll
		// via console: http://stackoverflow.com/questions/16631365/how-can-i-reset-achievements-from-google-game-services
		// String url = "https://www.googleapis.com/games/v1management/achievements/reset";

		AIR.dispatchEvent( GameServicesEvent.ACHIEVEMENT_RESET_ERROR, "Reset functionality is not supported on Android." );

		return null;
	}

}

