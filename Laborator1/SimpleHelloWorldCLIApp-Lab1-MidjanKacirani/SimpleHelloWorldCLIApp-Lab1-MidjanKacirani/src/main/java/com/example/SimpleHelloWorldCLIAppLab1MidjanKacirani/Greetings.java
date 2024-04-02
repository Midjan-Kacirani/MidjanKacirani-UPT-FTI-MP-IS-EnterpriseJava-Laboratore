package com.example.SimpleHelloWorldCLIAppLab1MidjanKacirani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
    @GetMapping(value = "/")
    public static String generalGreeting(@RequestParam(value = "emri", name = "emri", required = false) String emri){
        if(emri != null) return "Hello " + emri;
        else return "Hello world!";
    }

}
