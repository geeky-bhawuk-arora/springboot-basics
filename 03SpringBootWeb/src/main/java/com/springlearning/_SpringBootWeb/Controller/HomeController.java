package com.springlearning._SpringBootWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Bhawuk!";
    }
}
