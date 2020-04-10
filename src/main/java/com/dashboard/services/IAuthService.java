package com.dashboard.services;

import com.dashboard.models.UserModel;
/**
 * Created by saad on 4/9/2020.
 */
public interface IAuthService{

    public String get_token(UserModel userModel);
}
