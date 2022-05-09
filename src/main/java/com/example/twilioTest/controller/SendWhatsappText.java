package com.example.twilioTest.controller;

import com.example.twilioTest.request.SendMessageRequest;
import com.example.twilioTest.response.TwilioResponse;
import com.example.twilioTest.service.TwilioSimpleTextService;
import com.example.twilioTest.service.TwilioWhatsappText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class SendWhatsappText {

    @Autowired
    private TwilioWhatsappText twilioWhatsappText;

    @PostMapping("/whatsappText")
    public TwilioResponse sendMessage(@RequestBody SendMessageRequest sendMessageRequest) {
        return twilioWhatsappText.sendWhatsappTextMessage(sendMessageRequest);
    }

}
