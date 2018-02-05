package com.uninorte.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentSuma.Callback, FragmentResta.Callback, FragmentMulti.Callback{

    private TextView tv;
    private int value;
    private FragmentSuma fragmentSuma1;
    private FragmentMulti fragmentMulti1;
    private Boolean sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.TextView);
        value=0;
        tv.setText(value+"");

        fragmentSuma1 = new FragmentSuma();
        fragmentMulti1 = new FragmentMulti();

        sw = false;


    }

    @Override
    public void onSumar(int val) {
        value=value+val;
        tv.setText(value+"");

    }

    @Override
    public void onRestar(int val) {
        value=value-val;
        tv.setText(value+"");
    }

    @Override
    public void onMulti(int val) {
        value=value*val;
        tv.setText(value+"");

    }

    public void onClickCambiarFragment(View view) {
        if(sw==false){

            getSupportFragmentManager().beginTransaction().replace(R.id.FrameSuma,fragmentMulti1).commit();
        }else{
            getSupportFragmentManager().beginTransaction().replace(R.id.FrameSuma,fragmentSuma1).commit();
        }
        sw = !sw;
    }
}
