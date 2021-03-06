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

import org.eclipse.kapua.transport.TransportClientConnectOptions;
import org.eclipse.kapua.transport.mqtt.MqttClient;

/**
 * {@link Exception} to {@code throw} when the {@link MqttClient} is already connected and {@link MqttClient#connectClient(TransportClientConnectOptions)} is invoked.
 *
 * @since 1.2.0
 */
public class MqttClientAlreadyConnectedException extends MqttClientException {

    /**
     * Constructor.
     *
     * @param clientId The clientId of the {@link org.eclipse.kapua.transport.mqtt.MqttClient} that produced this {@link MqttClientCleanException}.
     * @since 1.2.0
     */
    public MqttClientAlreadyConnectedException(String clientId) {
        super(MqttClientErrorCodes.ALREADY_CONNECTED, clientId);
    }

}
