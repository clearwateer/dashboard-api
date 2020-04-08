package com.dashboard.controllers;

import com.dashboard.models.UserModel;
import org.springframework.web.bind.annotation.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by Haseeb on 4/3/2020.
 */
@RestController
public class AuthController {

    @RequestMapping(value = "/auth/token", method = RequestMethod.POST)
    public String token(@RequestBody UserModel model) {
        System.out.println("Haseeb Khalid");
        String url = "http://localhost:5000/connect/token";

        return "Generate Auth Token";
    }
}