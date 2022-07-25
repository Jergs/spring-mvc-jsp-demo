package com.spring.demo.springmvcjspdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }


    //  Can have HttpServletRequest request as parameter instead of @RequestParam
    // Then we need to do: String theName = request.getParameter("studentName");

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName,
                                Model model) {
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }
}
