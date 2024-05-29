package com.ty.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SandeepController {
	@GetMapping("chavan")
	public String getSandeep() {
		return "sandy.jsp";
	}
	@GetMapping("d2")
	public String getDemo() {
		return "demo.jsp";
	}
}
