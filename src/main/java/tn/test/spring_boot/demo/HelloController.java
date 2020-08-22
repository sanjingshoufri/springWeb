package tn.test.spring_boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;


@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping("/notice")
	public String noticeList(){
		// notice list from db-table
		
		
		// array turn into json format
        String[] names = {"taonian", "xiaoyu", "chu"};
        
        StringUtils.
        
        return "hello";
	}
}