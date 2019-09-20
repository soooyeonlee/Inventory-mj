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
    }
}
