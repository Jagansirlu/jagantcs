package ecommercoop.com.controller;


import org.springframework.web.bind.annotation.GetMapping;
// <artifactId>spring-boot-starter-web</artifactId>
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TextMessage {
	// api calling
	
	// GET method
	@GetMapping(value = "/showmessge") //
	String Message() {
		return "hi how are you";
	}

}
