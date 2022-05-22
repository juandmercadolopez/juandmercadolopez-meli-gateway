package com.juandmercadolopez.meli.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/mutantServiceFallBack")
    public String mutantServiceFallBackMethod(){
        return "Mutant service is taking longer than expected." +
                " Please try again later";
    }

}