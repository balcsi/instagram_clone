package com.example.balcsee.appbars_coordinatorlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by balcsee on 2017.10.21..
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private Button btn_test;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment3,container,false);
        btn_test = (Button) view.findViewById(R.id.btn_test1);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"TESTING BUTTON CLICK 1", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
