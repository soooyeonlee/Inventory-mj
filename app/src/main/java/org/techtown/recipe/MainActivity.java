package org.techtown.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.text.SimpleDateFormat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this,LoadingActivity.class));

        TextView time = findViewById(R.id.text_time);

        Long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEE");

        String getTime = sdf.format(date);

        time.setText("Today"+getTime);

        Button infoButton=findViewById(R.id.informbutton);
        infoButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(), foodlistActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
