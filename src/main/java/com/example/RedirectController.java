package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("redirect")
public class RedirectController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "redirect:/hello";
    }
}

@Controller
@RequestMapping("client")
class ClientController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "client";
    }
}

@Controller
@RequestMapping("hello")
class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "hello";
    }
}
