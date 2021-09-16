package com.pradeepjoam.live;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/")
	public String msgData()
	{
		return "Hello This is my First Sring boot application";
	}
}
