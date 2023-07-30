package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9; //these will fetch the values of the buttons
    int flag;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        flag=0;
        count=0;
    }

    //onclick method is used when we want a similar functionality over some buttons or all the buttons.
    //it structure is pretty similar to the set on click listener method.
    //it provides the reference of the view in a variable
    // so the on click method will also do the same

    public void check(View v){ //the variable v is providing the reference of which button has been clicked
        Button current=(Button) v; //typecasting the view into a button
        if(current.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                current.setText("X");
                flag = 1;
            } else {
                current.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
            }

            //conditions
            if (b1!=null && b2!=null && b3!=null && b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                //1
                Toast.makeText(this, "winner is: " + b1, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b4!=null && b5!=null && b6!=null && b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                //2
                Toast.makeText(this, "winner is: " + b4, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b7!=null && b8!=null && b9!=null && b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                //3
                Toast.makeText(this, "winner is: " + b7, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b1!=null && b4!=null && b7!=null && b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                //4
                Toast.makeText(this, "winner is: " + b1, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b2!=null && b5!=null && b8!=null && b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                //5
                Toast.makeText(this, "winner is: " + b2, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b3!=null && b6!=null && b9!=null && b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                //6
                Toast.makeText(this, "winner is: " + b3, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b1!=null && b5!=null && b9!=null && b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                //7
                Toast.makeText(this, "winner is: " + b1, Toast.LENGTH_SHORT).show();
                restart();
            } else if (b3!=null && b5!=null && b7!=null && b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                //8
                Toast.makeText(this, "winner is: " + b3, Toast.LENGTH_SHORT).show();
                restart();
            }
            else if(b1!=null && b2!=null && b3!=null && b4!=null && b5!=null && b6!=null && b7!=null && b8!=null && b9!=null && !b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")){
                Toast.makeText(this, "Match is drawn", Toast.LENGTH_SHORT).show();
                restart();
            }
        }

    }

    public void restart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }
}