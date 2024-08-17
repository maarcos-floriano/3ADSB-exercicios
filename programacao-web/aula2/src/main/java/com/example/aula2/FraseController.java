package com.example.aula2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frases")
public class FraseController {

    @GetMapping("/saudacao/{nome}/{idade}")
    public String hello(@PathVariable String nome, @PathVariable Integer idade){
        return "Hello %s, %d".formatted(nome, idade);
    }

}
