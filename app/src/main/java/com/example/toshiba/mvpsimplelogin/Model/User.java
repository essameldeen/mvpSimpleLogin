package com.example.toshiba.mvpsimplelogin.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User implements Iuser {
    // Every Thing  related to Data ( Logic Operation , getter , setter )

    private  String email;
    private  String passWord;

    public User(String email, String passWord) {
        this.email = email;
        this.passWord = passWord;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPassWord() {
        return this.passWord;
    }

    @Override
    public boolean isValidated() {
        // Check is Email is Empty and Format , And Password Length greater than 6 character
       if(!TextUtils.isEmpty(getEmail())&& Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassWord().length() > 6 ){
           return  true ;
       }
        return false;
    }
}
