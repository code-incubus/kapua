/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.translator.jms.kura;

import org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthChannel;
import org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthMessage;
import org.eclipse.kapua.service.device.call.message.kura.lifecycle.KuraBirthPayload;
import org.eclipse.kapua.translator.Translator;
import org.eclipse.kapua.transport.message.jms.JmsMessage;

import java.util.Date;

/**
 * {@link Translator} implementation from {@link JmsMessage} to {@link KuraBirthMessage}
 *
 * @since 1.0.0
 */
public class TranslatorLifeBirthJmsKura extends AbstractTranslatorLifecycleJmsKura<KuraBirthChannel, KuraBirthPayload, KuraBirthMessage> {

    public TranslatorLifeBirthJmsKura() {
        super(KuraBirthMessage.class);
    }

    @Override
    public KuraBirthMessage createLifecycleMessage(KuraBirthChannel kuraBirthChannel, Date receivedOn, KuraBirthPayload kuraBirthPayload) {
        return new KuraBirthMessage(kuraBirthChannel, receivedOn, kuraBirthPayload);
    }

    @Override
    public KuraBirthPayload createLifecyclePayload() {
        return new KuraBirthPayload();
    }

    @Override
    public KuraBirthChannel createLifecycleChannel(String messageClassifier, String scopeName, String clientId) {
        return new KuraBirthChannel(messageClassifier, scopeName, clientId);
    }
}
