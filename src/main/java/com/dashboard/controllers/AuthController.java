package com.dashboard.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Haseeb on 4/3/2020.
 */
@RestController
public class AuthController {

    @RequestMapping({"/auth/token"})
    public String firstPage() {
        System.out.println("Haseeb Khalid");
        return "Generate Auth Token";

    }

}