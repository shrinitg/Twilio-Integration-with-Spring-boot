package com.example.twilioTest.controller;

import com.example.twilioTest.request.SendMessageRequest;
import com.example.twilioTest.response.TwilioResponse;
import com.example.twilioTest.service.TwilioSimpleTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendSimpleText {

    @Autowired
    private TwilioSimpleTextService twilioSimpleTextService;

    @PostMapping("/simpleText")
    public TwilioResponse sendSimpleText(@RequestBody SendMessageRequest sendMessageRequest) {
        return twilioSimpleTextService.sendMessage(sendMessageRequest);
    }

}
