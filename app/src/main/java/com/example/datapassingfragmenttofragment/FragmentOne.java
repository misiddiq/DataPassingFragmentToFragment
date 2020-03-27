package com.example.datapassingfragmenttofragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    EditText e1, e2;
    Button b;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        e1 = (EditText) v.findViewById(R.id.e1);
        e2 = (EditText) v.findViewById(R.id.e2);
        b = (Button) v.findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String address = e2.getText().toString();
                //Send data to Main Activity then to the next Fragment
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.f1(name, address);
                e1.setText("");
                e2.setText("");
            }
        });

        return v;
    }

}
