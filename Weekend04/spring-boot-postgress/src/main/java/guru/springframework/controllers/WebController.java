package guru.springframework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from HelloController!";
//    }
    
//    @ResponseBody
//    @RequestMapping("/")
//    public String home() {
//        String html = "";
//        html += "<ul>";
//        html += " <li><a href='/jimmyPost'>jimmyPost</a></li>";
//        html += " <li><a href='/jesseGet'>jesseGet</a></li>";
//        html += " <li><a href='/jessePost'>jessePost</a></li>";
//       
//        html += "</ul>";
//        return html;
//    }

    
    @RequestMapping(value = "/jimmyPost", method = RequestMethod.POST)
    public String jimmyTest() {
    	
        return "Hello from Jimmy!!!";
    }
    
    @GetMapping("/jesseGet")   //http://localhost:8080/jesseGet?imageName=asss.jpg
    public String jesseTestGet(@RequestParam(value="imageName", defaultValue="NOIMAGE") String imageName) {
    	
        return "Hello from Jesse - GET!!!: IMAGE:" + imageName;
    }

    @PostMapping("/jessePost")
    public String jesseTestPost(@RequestParam(value="imageName", defaultValue="NOIMAGE") String imageName) {
    	
        return "Hello from Jesse - POST!!!: IMAGE:" + imageName;
    }

}