package com.gmail.alexejkrawez;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello-world")
    public String sayHello() {
        return "hello-world";   // вернёт пользователю hello-world.html страницу
    }


}