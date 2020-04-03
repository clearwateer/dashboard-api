package com.dashboard.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by saad on 4/2/2020.
 */

@RestController
public class UsersController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
