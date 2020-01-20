package ru.teach.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControllerServlet {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String testController() {
        return "TestController111!!!";
    }
}