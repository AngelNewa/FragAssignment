package com.app.fragassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.fragassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pallindrum extends Fragment {


    public Pallindrum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pallindrum, container, false);
    }

}