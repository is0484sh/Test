package kr.co.softsoldesk.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softsoldesk.beans.DataBean;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		
		bean.setId("data1");
		bean.setPw("data2");
		bean.setTextarea("asdf");
		
		return "test1";
	}
	
}
