package com.example.alex.dg_chatbot.UI.Tutorial;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.alex.dg_chatbot.R;
import com.example.alex.dg_chatbot.UI.Login.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tuto1Fragment extends Fragment {

    private Button btSkip;

    public Tuto1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout layout = (FrameLayout) inflater.inflate(R.layout.fragment_tuto1, container, false);
        btSkip = (Button) layout.findViewById(R.id.btSkip);
        btSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        return layout;
    }

}
