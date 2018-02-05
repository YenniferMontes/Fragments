package com.uninorte.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentMulti extends Fragment {

    private FragmentMulti.Callback callback;
    Button buttonMulti;

    public FragmentMulti() {

    }

    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (FragmentMulti.Callback) context;

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_multi, container, false);

        buttonMulti = v.findViewById(R.id.BotonMultiplicar);
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.onMulti(2);

            }
        });

        return v;
    }

    public interface Callback{
        public void onMulti(int val);



    }
}
