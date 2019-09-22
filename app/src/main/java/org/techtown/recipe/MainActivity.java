package org.techtown.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button1=(Button)findViewById(R.id.start);
//        button1.setOnClickListener(
//                new Button.OnClickListener(){
//                    public void onClick(View view){
//                        Intent intent=new Intent(getApplicationContext(),Menu.class);
//                        startActivity(intent);
//                    }
//                }
//        );
    }
}
