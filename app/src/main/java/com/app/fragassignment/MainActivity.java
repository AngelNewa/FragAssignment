package com.app.fragassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.fragassignment.fragments.Area;
import com.app.fragassignment.fragments.Armstrong;
import com.app.fragassignment.fragments.Automorphic;
import com.app.fragassignment.fragments.Pallindrum;
import com.app.fragassignment.fragments.SimpleInterest;
import com.app.fragassignment.fragments.Swapping;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea, btnPalindrome, btnSI, btnArmstrong, btnAuto, btnSwapping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArea = findViewById(R.id.btnArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAuto = findViewById(R.id.btnAutomorphic);
        btnSwapping = findViewById(R.id.btnSwapping);


        btnArea.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAuto.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btnArea:
                Area area = new Area();
                fragmentTransaction.replace(R.id.fragmentContainer, area);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                Pallindrum palindrome = new Pallindrum();
                fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.btnSI:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;
            case R.id.btnArmstrong:
                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer, armstrong);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutomorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphic);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwapping:
                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer, swapping);
                fragmentTransaction.commit();
                break;
        }

    }
}

