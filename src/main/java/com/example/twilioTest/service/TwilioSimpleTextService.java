package com.example.twilioTest.service;

import com.example.twilioTest.request.SendMessageRequest;
import com.example.twilioTest.response.TwilioResponse;

public interface TwilioSimpleTextService {

    TwilioResponse sendMessage(SendMessageRequest sendMessageRequest);

}