package com.test.finalexamination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    EditText UserName = (EditText)findViewById(R.id.textView);
    EditText Password = (EditText)findViewById(R.id.textView2);

    public void login(TextView){
        val username = null
        val password = null
        if (username.TextView().toString().equals("admin") && password.TextView().toString().equals("admin")){

            //correct password
        }else {
            //wrong password
        }
    }