package com.example.aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    @GetMapping("/{n1}/{n2}")
    public Integer soma(
            @PathVariable Integer n1,
            @PathVariable Integer n2
    ){
        return n1 + n2;
    }

}
