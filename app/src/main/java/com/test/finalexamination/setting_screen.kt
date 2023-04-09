package com.test.finalexamination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
private edittextpswrdNew, edittextpswrdNew, editTextpswrdcnfm

class setting_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_screen)

    }

    override fun getSupportActionBar(): ActionBar? {

        return super.getSupportActionBar().setTitle("Change Password")

        var edittextpswrdNew = findViewById(R.id.editText_chng_pswrd_new)
        var edittextpswrdNew = findViewById(R.id.editText_chng_pswrd_new)
        var editTextpswrdcnfm= findViewById(R.id.chng.pswrd.new.confirm)


    }
}