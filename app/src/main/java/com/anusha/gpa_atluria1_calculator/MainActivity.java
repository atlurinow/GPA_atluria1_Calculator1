package com.anusha.gpa_atluria1_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView v6 = (TextView)findViewById(R.id.viewText6);
        v6.setText(" ");


        Button clickButton = (Button) findViewById(R.id.bt1);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Button cb1 = (Button) findViewById(R.id.bt1);
                RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl1);
                EditText c1 = (EditText) findViewById(R.id.editText1);
                EditText c2 = (EditText) findViewById(R.id.editText2);
                EditText c3 = (EditText) findViewById(R.id.editText3);
                EditText c4 = (EditText) findViewById(R.id.editText4);
                EditText c5 = (EditText) findViewById(R.id.editText5);
                TextView v7 = (TextView) findViewById(R.id.viewText6);

                if (cb1.getText().toString() != "CLEAR") {


                    TextView v1 = (TextView) findViewById(R.id.viewText1);
                    if (c1.getText().toString().trim().length() == 0) {
                        c1.setError("You must enter a value for " + v1.getText());
                    }
                    //EditText c2 = (EditText) findViewById(R.id.editText2);
                    TextView v2 = (TextView) findViewById(R.id.viewText2);
                    if (c2.getText().toString().trim().length() == 0) {
                        c2.setError("You must enter a value for " + v2.getText());
                    }
                    //EditText c3 = (EditText) findViewById(R.id.editText3);
                    TextView v3 = (TextView) findViewById(R.id.viewText3);
                    if (c3.getText().toString().trim().length() == 0) {
                        c3.setError("You must enter a value for " + v3.getText());
                    }
                    //EditText c4 = (EditText) findViewById(R.id.editText4);
                    TextView v4 = (TextView) findViewById(R.id.viewText4);
                    if (c4.getText().toString().trim().length() == 0) {
                        c4.setError("You must enter a value for " + v4.getText());
                    }
                    //EditText c5 = (EditText) findViewById(R.id.editText5);
                    TextView v5 = (TextView) findViewById(R.id.viewText5);
                    if (c5.getText().toString().trim().length() == 0) {
                        c5.setError("You must enter a value for " + v5.getText());
                    }
int gpaScore;



                    if (c1.getText().toString().length() != 0
                    && c2.getText().toString().length() != 0
                            && c3.getText().toString().length() != 0
                            && c4.getText().toString().length() != 0
                            && c5.getText().toString().length() != 0){
                        gpaScore = (Integer.parseInt(c1.getText().toString())
                                + Integer.parseInt(c2.getText().toString())
                                + Integer.parseInt(c3.getText().toString())
                                + Integer.parseInt(c4.getText().toString())
                                + Integer.parseInt(c5.getText().toString())) / 5;

                    }
                    else { return;

                    }



                    // +c2.getText()+c3.getText()+c4.getText()+c5.getText();//)/5;
                    if (gpaScore < 60) {

                        v7.setText("Your GPA Score is " + gpaScore);
                        rl1.setBackgroundColor(Color.parseColor("#ff0000"));
                    }


                    if (gpaScore > 60 && gpaScore < 80) {

                        v7.setText("Your GPA Score is " + gpaScore);
                        rl1.setBackgroundColor(Color.parseColor("#fff000"));
                    }

                    if (gpaScore > 80) {

                        v7.setText("Your GPA Score is " + gpaScore);
                        rl1.setBackgroundColor(Color.parseColor("#28B463"));
                    }

                    cb1.setText("CLEAR");
                } else {
                    cb1.setText("Compute GPA");
                    c1.setText("");
                    c2.setText("");
                    c3.setText("");
                    c4.setText("");
                    c5.setText("");
                    v7.setText(" ");
                    rl1.setBackgroundColor(Color.parseColor("#DCDCDC"));

                }



                //c1.setError("You must enter a value for"+c1.getText());
                //cb1.setText("Clear");
                //cb1.setError("Fatal Error...");
            }
        });
    }
}
