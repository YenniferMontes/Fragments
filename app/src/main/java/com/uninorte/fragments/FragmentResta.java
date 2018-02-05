package com.uninorte.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentResta extends Fragment {

    private Callback callback;
    Button buttonResta;


    public FragmentResta() {
        // Required empty public constructor
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (FragmentResta.Callback) context;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_resta, container, false);

        buttonResta = v.findViewById(R.id.BotonRestar);
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.onRestar(1);

            }
        });

        return v;
    }


    public interface Callback{
        public void onRestar(int val);


    }

}
