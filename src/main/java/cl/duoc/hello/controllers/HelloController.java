package cl.duoc.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam(required = false) String value) {
        String name = "Mundo";
        if (value!=null) name = value;
        return String.format("¡Hola, %s!", name);
    }
}
