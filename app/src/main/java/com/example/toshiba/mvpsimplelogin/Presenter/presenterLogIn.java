package com.example.toshiba.mvpsimplelogin.Presenter;

import android.view.View;

import com.example.toshiba.mvpsimplelogin.Model.User;
import com.example.toshiba.mvpsimplelogin.View.IlogInView;

public class presenterLogIn implements ILogIn {

    IlogInView ilogInView ;

    public presenterLogIn( IlogInView ilogInView) {
        this.ilogInView = ilogInView;
    }

    @Override
    public void logIn(String name, String passWord) {
        User user = new User(name,passWord);
        boolean isValid= user.isValidated();
        if(isValid){
            ilogInView.resultLogIn("Login Success.");
        }else {
            ilogInView.resultLogIn("Login Failed.");
        }

    }


}
