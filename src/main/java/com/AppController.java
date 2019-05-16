package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class AppController {

    @Autowired
    private Facade facade;

    @RequestMapping("jsp")
    public String jsp(ModelMap model) {
        System.out.println("in controller");
        model.addAttribute("message", facade.getMessage());
        model.addAttribute("singleValue", "mySingle value");
        model.addAttribute("number", 5);
        model.addAttribute("test", false);
        final List<String> infoForJsp = asList("item1", "item2", "item3");
        model.addAttribute("info", infoForJsp);
        return "hello";
    }

    @RequestMapping("action")
    public String action(ModelMap model) {
        System.out.println("in action");
        model.addAttribute("message", facade.getMessage());
        model.addAttribute("singleValue", "mySingle value CHANGED");
        model.addAttribute("number", -2);
        model.addAttribute("test", true);
        final List<String> infoForJsp = asList("package", "stuff", "item item");
        model.addAttribute("info", infoForJsp);
        return "hello";
    }
    @RequestMapping("library")
    public String library(ModelMap model){
        Book[] books = new Book[60];
        facade.getBooks();

    return "hello";
    }
}
