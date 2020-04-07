package com.dashboard.controllers;

import com.dashboard.models.UserModel;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Haseeb on 4/3/2020.
 */
@RestController
public class AuthController {

    @RequestMapping(value = "/auth/token", method = RequestMethod.POST)
    public String token(@RequestBody UserModel model) {
        System.out.println("Haseeb Khalid");
        return "Generate Auth Token";
    }
}