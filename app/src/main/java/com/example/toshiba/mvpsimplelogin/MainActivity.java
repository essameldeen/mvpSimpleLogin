package com.example.toshiba.mvpsimplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toshiba.mvpsimplelogin.Presenter.ILogIn;
import com.example.toshiba.mvpsimplelogin.Presenter.presenterLogIn;
import com.example.toshiba.mvpsimplelogin.View.IlogInView;

public class MainActivity extends AppCompatActivity  implements IlogInView {

    presenterLogIn iLogInPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView email , passWord ;
        Button  logIn;

        // init View
        email = (TextView)findViewById(R.id.txt_email);
        passWord = (TextView)findViewById(R.id.txt_password);
        logIn=(Button)findViewById(R.id.btn_logIn);
        // init presenter
        iLogInPresenter = new presenterLogIn(this);
        //
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iLogInPresenter.logIn(email.getText().toString(),passWord.getText().toString());

            }
        });



    }

    @Override
    public void resultLogIn(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }


}
