package pers.xxx.studyunittesting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(value="hello",method=RequestMethod.GET)
	private String get() {
		return "hello world!";
	}
}
