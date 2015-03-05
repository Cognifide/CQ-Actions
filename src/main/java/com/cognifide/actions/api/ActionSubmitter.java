package com.cognifide.actions.api;

import java.util.Map;

import aQute.bnd.annotation.ConsumerType;

/**
 * Service that allows to send an action.
 * 
 * @author Tomasz Rękawek
 *
 */
@ConsumerType
public interface ActionSubmitter {

	/**
	 * Send action with given type and properties
	 * 
	 * @param actionType Type of the action (must be the same as the one accepted by {@link ActionReceiver}.
	 * @param properties Properties of the action
	 * @throws ActionSendException
	 */
	void sendAction(String actionType, Map<String, String> properties) throws ActionSendException;
}
