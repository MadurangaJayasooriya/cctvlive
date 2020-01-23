package com.cctv.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SmsApplication {

	public static final String ACCOUNT_SID =
			"ACed29af868a729845bfabd8c8342a2813";
	public static final String AUTH_TOKEN =
			"bf68cca30f70a844ed48763f3487f309";
	public static void main(String[] args) {

		SpringApplication.run(SmsApplication.class, args);

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message
				.creator(
						new PhoneNumber("+94712913837"), // to
						new PhoneNumber("+12564884276"), // from
						"Server Started !!!")
				.create();



	}


}
