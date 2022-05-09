package com.example.twilioTest.service.impl;

import com.example.twilioTest.constant.TwilioCreds;
import com.example.twilioTest.request.SendMessageRequest;
import com.example.twilioTest.response.TwilioResponse;
import com.example.twilioTest.service.TwilioSimpleTextService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class TwilioSimpleTextServiceImpl implements TwilioSimpleTextService {

    @Override
    public TwilioResponse sendSimpleTextMessage(SendMessageRequest sendMessageRequest) {
        Twilio.init(TwilioCreds.TWILIO_ACCOUNT_SID, TwilioCreds.TWILIO_AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(sendMessageRequest.getMessageTo()),
                        TwilioCreds.MESSAGING_SERVICE_SID,
                        sendMessageRequest.getMessage())
                .create();
        return TwilioResponse.builder().accountSid(message.getAccountSid())
                .apiVersion(message.getApiVersion()).body(message.getBody()).errorMessage(message.getErrorMessage())
                .dateCreated(String.valueOf(message.getDateCreated()))
                .dateUpdated(String.valueOf(message.getDateUpdated()))
                .messagingServiceSid(message.getMessagingServiceSid())
                .direction(String.valueOf(message.getDirection())).sid(message.getSid())
                .numMedia(message.getNumMedia()).numSegments(message.getNumSegments())
                .status(String.valueOf(message.getStatus())).to(message.getTo())
                .uri(message.getUri()).dateSent(message.getDateSent()).errorCode(message.getErrorCode())
                .from(message.getFrom()).price(message.getPrice()).priceUnit(message.getPriceUnit()).build();
    }
}
