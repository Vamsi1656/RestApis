package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SMSPojo;

@RestController

public class SMSController {
	
	
	@PostMapping("/sms")
	public String sendOTP(@RequestBody SMSPojo sms) {
		
		try {
			System.out.println(sms.getPhoneno());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "OTP sent successFully";
		
		
	}

}
