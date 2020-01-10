package com.example.assignment_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    RelativeLayout create, name, birthday, gender, mobile, pass, em, terms;
    Button next1, next2, next3, next4, next5, next6, next7, next8;
    TextView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        create = findViewById(R.id.create);
        name = findViewById(R.id.name);
        birthday = findViewById(R.id.birthday);
        gender = findViewById(R.id.gender);
        mobile = findViewById(R.id.mobile);
        pass = findViewById(R.id.pass);
        em = findViewById(R.id.em);
        terms = findViewById(R.id.terms);

        menu = findViewById(R.id.menu);

        next1 = findViewById(R.id.next1);
        next2 = findViewById(R.id.next2);
        next3 = findViewById(R.id.next3);
        next4 = findViewById(R.id.next4);
        next5 = findViewById(R.id.next5);
        next6 = findViewById(R.id.next6);
        next7 = findViewById(R.id.next7);
        next8 = findViewById(R.id.next8);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Name");
                create.setVisibility(View.GONE);
                name.setVisibility(View.VISIBLE);
            }
        });

        next2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Birthday");
                name.setVisibility(View.GONE);
                birthday.setVisibility(View.VISIBLE);

            }
        }));

        next3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Gender");

                birthday.setVisibility(View.GONE);
                gender.setVisibility(View.VISIBLE);

            }
        }));

        next4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Mobile Number");
                gender.setVisibility(View.GONE);
                mobile.setVisibility(View.VISIBLE);
            }
        }));

        next5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Password");
                mobile.setVisibility(View.GONE);
                pass.setVisibility(View.VISIBLE);
            }
        }));

        next6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Email");
                pass.setVisibility(View.GONE);
                em.setVisibility(View.VISIBLE);
            }
        }));

        next7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setText("Terms & Condition");
                em.setVisibility(View.GONE);
                terms.setVisibility(View.VISIBLE);
            }
        }));

        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignupActivity.this, "New Account created Successfully...!!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
