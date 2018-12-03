package com.weeekend002.sbtest.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    
    @RequestMapping(value = "/jimmy", method = RequestMethod.POST)
    public String jimmyTest() {
    	
        return "Hello from Jimmy!!!";
    }
    
    @GetMapping("/jesseGet")
    public String jesseTestGet(@RequestParam(value="imageName", defaultValue="NOIMAGE") String imageName) {
    	
        return "Hello from Jesse - GET!!!: IMAGE:" + imageName;
    }

    @PostMapping("/jessePost")
    public String jesseTestPost(@RequestParam(value="imageName", defaultValue="NOIMAGE") String imageName) {
    	
        return "Hello from Jesse - POST!!!: IMAGE:" + imageName;
    }

}