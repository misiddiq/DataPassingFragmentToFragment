package com.example.datapassingfragmenttofragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    TextView v1, v2;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        v1 = (TextView) v.findViewById(R.id.v1);
        v2 = (TextView) v.findViewById(R.id.v2);

        Bundle b2 = getArguments();

        if(b2 != null) {

            String name = b2.getString("name");
            String address = b2.getString("address");
            v1.setText("\n"+name);
            v2.setText("\n"+address);
        }

        return v;
    }
}
