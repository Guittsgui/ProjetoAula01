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
import android.widget.Toast;

import com.example.projetoaula01.R;

public class MainActivity extends AppCompatActivity {

    Button personButton, remedyButton, peopleListButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        personButton.setOnClickListener(handleRegisterPerson());
        remedyButton.setOnClickListener(handleRegisterRemedy());
        peopleListButton.setOnClickListener(handleSeePersonList());
    }

    private View.OnClickListener handleSeePersonList() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterRemedyActivity.class);
                viewListPerson.launch(intent);
            }
        };
    }

    ActivityResultLauncher<Intent> viewListPerson = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Toast.makeText(getApplicationContext(), "lista", Toast.LENGTH_LONG).show();
                }
            }
    );

    private View.OnClickListener handleRegisterRemedy() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterRemedyActivity.class);
                viewRegisterRemedy.launch(intent);
            }
        };
    }

    ActivityResultLauncher<Intent> viewRegisterRemedy = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Toast.makeText(getApplicationContext(), "remedio", Toast.LENGTH_LONG).show();
                }
            }
    );


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
                    Toast.makeText(getApplicationContext(), "pessoa" , Toast.LENGTH_LONG).show();
                }
            }
    );

    private void binding() {
        personButton = findViewById(R.id.personButton);
        remedyButton = findViewById(R.id.remedyButton);
        peopleListButton = findViewById(R.id.peopleListButton);
    }
}