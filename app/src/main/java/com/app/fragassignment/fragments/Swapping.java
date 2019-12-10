package com.app.fragassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.app.fragassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Swapping extends Fragment implements View.OnClickListener{
    private Button btnSwapping;
    private TextView tvSwapping;
    private EditText etFirst,etSecond;


    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_swapping,container,false);
        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnSwapping=view.findViewById(R.id.btnSwapping);
        tvSwapping=view.findViewById(R.id.tvSwapping);

        btnSwapping.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        int first,second;
        first=Integer.parseInt(etFirst.getText().toString());
        second=Integer.parseInt(etSecond.getText().toString());
        first=first+second;
        second=first-second;
        first=first-second;

        tvSwapping.setText("first number: "+first+ "second number: "+second);

    }
}
