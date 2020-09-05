package tn.test.spring_boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.*;

@RestController
public class HelloController {
	@RequestMapping("/notice")
	public String noticeList(){
		// array turn into json format
        String[] names = {"taonian", "xiaoyu", "chu"};
        
        
        return "hello";
	}
}