package com.MyBlog.Blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/blog/mainpage")
    public String mainpage(){
        return "MainPage";
    }
}
