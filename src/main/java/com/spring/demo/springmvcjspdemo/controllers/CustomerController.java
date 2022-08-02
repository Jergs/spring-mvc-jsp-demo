package com.spring.demo.springmvcjspdemo.controllers;

import com.spring.demo.springmvcjspdemo.model.Customer;
import com.spring.demo.springmvcjspdemo.model.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("customer") @Valid Customer customer,
                              BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            return "customer-form";
        else{
            return "customer-confirmation";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }
}
