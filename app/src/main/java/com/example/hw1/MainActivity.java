package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp_size;
    TextView tv_text;
    EditText et_custom_size;
    int castm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp_size= findViewById(R.id.main_sp_size);
        tv_text= findViewById(R.id.main_tv_text);
        et_custom_size= findViewById(R.id.main_et_customSize);
        sp_size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        tv_text.setTextColor(0xffff0000);
                        break;
                    case 1:
                        tv_text.setTextColor(0xFF00FF00);
                        break;
                    case 2:
                        tv_text.setTextColor(0xFF0000FF‏);
                        break;
                    case 3:

                         castm=Integer.parseInt( et_custom_size.getText().toString());

                        tv_text.setTextColor(castm);
                         break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}