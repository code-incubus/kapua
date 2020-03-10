/*******************************************************************************
 * Copyright (c) 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.transport.mqtt.exception;

import org.eclipse.kapua.transport.message.mqtt.MqttTopic;
import org.eclipse.kapua.transport.mqtt.MqttClient;

/**
 * {@link Exception} to {@code throw} when the {@link MqttClient} cannot set the {@link org.eclipse.kapua.transport.mqtt.MqttResponseCallback}
 *
 * @since 1.2.0
 */
public class MqttClientCallbackSetException extends MqttClientException {

    final MqttTopic topic;

    /**
     * Constructor.
     *
     * @param cause    The root {@link Throwable} that caused the error.
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientCallbackSetException}.
     * @param topic    The response {@link MqttTopic} on which the {@link org.eclipse.kapua.transport.mqtt.MqttResponseCallback} was subscribed.
     * @since 1.2.0
     */
    public MqttClientCallbackSetException(Throwable cause, String clientId, MqttTopic topic) {
        super(MqttClientErrorCodes.CALLBACK_SET_ERROR, cause, clientId, topic.getTopic());

        this.topic = topic;
    }

    /**
     * Gets the response {@link MqttTopic} on which the {@link org.eclipse.kapua.transport.mqtt.MqttResponseCallback} was subscribed.
     *
     * @return The response {@link MqttTopic} on which the {@link org.eclipse.kapua.transport.mqtt.MqttResponseCallback} was subscribed.
     * @since 1.2.0
     */
    public MqttTopic getTopic() {
        return topic;
    }

}
