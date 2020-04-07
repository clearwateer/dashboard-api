package com.dashboard.controllers;

import com.dashboard.models.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * Created by Haseeb on 4/3/2020.
 */
@RestController
public class AuthController {

    @RequestMapping({"/auth/token"})
    public String token(@RequestBody UserModel model) {
        System.out.println("Haseeb Khalid");
        return "Generate Auth Token";
    }

}