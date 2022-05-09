package com.example.twilioTest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TwilioResponse{

	@JsonProperty(value = "error_message")
	private Object errorMessage;

	@JsonProperty(value = "date_updated")
	private String dateUpdated;

	@JsonProperty(value = "date_sent")
	private Object dateSent;

	@JsonProperty(value = "date_created")
	private String dateCreated;

	@JsonProperty(value = "body")
	private String body;

	@JsonProperty(value = "api_version")
	private String apiVersion;

	@JsonProperty(value = "num_segments")
	private String numSegments;

	@JsonProperty(value = "uri")
	private String uri;

	@JsonProperty(value = "sid")
	private String sid;

	@JsonProperty(value = "num_media")
	private String numMedia;

	@JsonProperty(value = "price_unit")
	private Object priceUnit;

	@JsonProperty(value = "messaging_service_sid")
	private String messagingServiceSid;

	@JsonProperty(value = "price")
	private Object price;

	@JsonProperty(value = "account_sid")
	private String accountSid;

	@JsonProperty(value = "from")
	private Object from;

	@JsonProperty(value = "error_code")
	private Object errorCode;

	@JsonProperty(value = "to")
	private String to;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "direction")
	private String direction;

}
