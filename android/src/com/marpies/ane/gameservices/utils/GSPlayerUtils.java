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

package com.marpies.ane.gameservices.utils;

import com.google.android.gms.games.Player;
import org.json.JSONObject;

class GSPlayerUtils {

	static JSONObject getJSON( Player player ) {
		JSONObject response = new JSONObject();
		if( player != null ) {
			try {
				response.put( "playerId", player.getPlayerId() );
				response.put( "displayName", player.getDisplayName() );
				if( player.hasIconImage() ) {
					response.put( "iconImageUri", player.getIconImageUri().toString() );
				}
				if( player.hasHiResImage() ) {
					response.put( "hiResImageUri", player.getHiResImageUri().toString() );
				}
				// alias not available
			} catch( Exception e ) {
				e.printStackTrace();
			}
		}
		return response;
	}
}
