package com.farrush.gw.biggerorsmaller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling value from edit text & enter it to string
                String nla = et.getText().toString();

                //checking if edit text is empty
                //condition if length is empty
                if(nla.isEmpty()){
                    //give error warning
                    et.setError("Tidak Boleh Kosong");
                }else{

                    //change value from string to int
                    int ala = Integer.parseInt(nla);

                    if(ala < 10){
                        txt.setText("This number Is Smaller Than 10");
                    }else if(ala == 10){
                        txt.setText("This Number Is 10");
                    }else{
                        txt.setText("This Number IS Bigger Than 10");
                    }
                }
            }
        });
    }
}
