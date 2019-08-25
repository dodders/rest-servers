package org.gd.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServer {

    private static String template = "Hello %s";

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("/test: " + name);
        return String.format(template, name);
    }

}
