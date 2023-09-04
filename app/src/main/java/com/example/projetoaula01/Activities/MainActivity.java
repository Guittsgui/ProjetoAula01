package com.example.projetoaula01.Activities;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetoaula01.R;

public class MainActivity extends AppCompatActivity {

    Button personButton, remedyButton, peopleListButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        personButton.setOnClickListener(handleRegisterPerson());
    }





    private View.OnClickListener handleRegisterPerson() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterPersonActivity.class );
                viewRegisterPerson.launch(intent);
            }
        };
    }

    ActivityResultLauncher<Intent> viewRegisterPerson = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                }
            }
    );

    private void binding() {
        personButton = findViewById(R.id.personButton);
        remedyButton = findViewById(R.id.remedyButton);
        peopleListButton = findViewById(R.id.peopleListButton);
    }
}