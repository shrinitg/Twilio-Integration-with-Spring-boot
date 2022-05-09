package com.example.twilioTest.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SendMessageRequest {

    private String message;
    private String messageTo;

}
