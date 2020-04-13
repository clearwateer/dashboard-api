package com.dashboard.controllers;

import com.dashboard.models.UserModel;
import com.dashboard.services.IAuthService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Haseeb on 4/3/2020.
 */
@RestController
public class AuthController {
    @Autowired
    private IAuthService authService;

    AuthController(IAuthService authService){
        this.authService = authService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/auth/token", method = RequestMethod.POST)
    public JSONObject token(@RequestBody UserModel model) {
//        System.out.println("Haseeb Khalid");
//        String url = "http://localhost:5000/connect/token";

        return authService.get_token(model);
    }
}