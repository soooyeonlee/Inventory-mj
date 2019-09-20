package org.techtown.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        Button button1=(Button)findViewById(R.id.ricebutton);
        button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),riceActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button2=(Button)findViewById(R.id.soupbutton);
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),soupActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button3=(Button)findViewById(R.id.noodlebutton);
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),noodleActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button4=(Button)findViewById(R.id.sidedishesbutton);
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),sidedishesActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button5=(Button)findViewById(R.id.fishbutton);
        button5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),fishActivity.class);
                        startActivity(intent);
                    }
                }
        );

        Button button6=(Button)findViewById(R.id.meatbutton);
        button6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),meatActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
