package com.example.projetoaula01.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.example.projetoaula01.R;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterPersonActivity extends AppCompatActivity {

    Button saveButton;
    TextInputLayout nameField, adressField, obsField;
    CheckBox smoke, diabetic, hiper;
    RadioButton men, woman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_person);

        binding();
    }

    private void binding() {
        saveButton = findViewById(R.id.saveButton);
        nameField = findViewById(R.id.nameTIL);
        adressField = findViewById(R.id.adressTIL);
        obsField = findViewById(R.id.obsTIL);
        smoke = findViewById(R.id.smokeCB);
        diabetic = findViewById(R.id.diabeticCB);
        hiper = findViewById(R.id.hiperCB);
        men = findViewById(R.id.menRB);
        woman = findViewById(R.id.womanRB);
    }
}