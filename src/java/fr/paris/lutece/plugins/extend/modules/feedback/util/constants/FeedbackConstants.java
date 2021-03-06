/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.extend.modules.feedback.util.constants;


/**
 *
 * FeedbackConstants
 *
 */
public final class FeedbackConstants
{
    // BEAN
    public static final String BEAN_CONFIG_SERVICE = "extend-feedback.feedbackResourceExtenderconfigService";

    // MESSAGE
    public static final String MESSAGE_DEFAULT_MESSAGE = "module.extend.feedback.message.defaultMessage";
    public static final String MESSAGE_NOTIFY_SUBJECT = "module.extend.feedback.message.notifySubject";
    public static final String MESSAGE_MESSAGE_SENT = "module.extend.feedback.message.messageSent";
    public static final String MESSAGE_ERROR_BAD_JCAPTCHA = "module.extend.feedback.message.error.badJcaptcha";

    // PROPERTIES
    public static final String PROPERTY_USE_CAPTCHA = "module.extend.feedback.useCaptcha";
    public static final String PROPERTY_FEEDBACK_CONFIG_LABEL_NO_MAILING_LIST = "module.extend.feedback.feedback_config.labelNoMailingList";
    public static final String PROPERTY_WEBMASTER_EMAIL = "email.webmaster";

    // PARAMETERES
    public static final String PARAMETER_MESSAGE = "message";
    public static final String PARAMETER_ID_EXTENDABLE_RESOURCE = "idExtendableResource";
    public static final String PARAMETER_EXTENDABLE_RESOURCE_TYPE = "extendableResourceType";
    public static final String PARAMETER_EXTENDER_TYPE = "extenderType";

    // MARKS
    public static final String MARK_MESSAGE = "message";
    public static final String MARK_ID_EXTENDABLE_RESOURCE = "idExtendableResource";
    public static final String MARK_EXTENDABLE_RESOURCE_TYPE = "extendableResourceType";
    public static final String MARK_FEEDBACK_CONFIG = "feedbackConfig";
    public static final String MARK_LIST_IDS_MAILING_LIST = "listIdsMailingList";
    public static final String MARK_WEBAPP_URL = "webapp_url";
    public static final String MARK_LOCALE = "locale";
    public static final String MARK_RESOURCE_EXTENDER_NAME = "resourceExtenderName";
    public static final String MARK_CAPTCHA = "captcha";
    public static final String MARK_IS_ACTIVE_CAPTCHA = "is_active_captcha";

    // CONSTANTS
    public static final String JCAPTCHA_PLUGIN = "jcaptcha";

    /**
     * Instantiates a new your opinion constants.
     */
    private FeedbackConstants(  )
    {
    }
}
