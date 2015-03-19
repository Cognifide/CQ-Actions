/*--
 * #%L
 * Cognifide Actions
 * %%
 * Copyright (C) 2015 Cognifide
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.cognifide.actions.api;

import java.util.Map;

import aQute.bnd.annotation.ConsumerType;

/**
 * An OSGi service that handles an incoming action.
 * 
 * @author Tomasz Rękawek
 */
@ConsumerType
public interface ActionReceiver {

	/**
	 * Returns action type for this action receiver
	 */
	String getType();

	/**
	 * Handle incoming action with given type.
	 * 
	 * @param properties
	 */
	void handleAction(Map<String, String> properties);
}