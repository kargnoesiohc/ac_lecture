package com.test.aaa1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //Controller Class등록, xml에 빈 생성 필요
public class HomeController {
	@RequestMapping("/main")
	public String xxx() {
		System.out.println("main()호출");
		return "home";
	}
}
