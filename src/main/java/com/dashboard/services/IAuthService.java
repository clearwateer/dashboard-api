package com.dashboard.services;

import com.dashboard.models.UserModel;
import org.json.JSONObject;

/**
 * Created by saad on 4/9/2020.
 */
public interface IAuthService{

    public JSONObject get_token(UserModel userModel);
}
