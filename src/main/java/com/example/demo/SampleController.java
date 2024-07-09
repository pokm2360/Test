package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping
	public String ex() {
//		String, void는 보통 html파일을 리턴
		return "ex1";
	}
}
