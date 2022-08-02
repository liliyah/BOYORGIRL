package com.testapps.sararagab.boyorgirl;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {
   private Button boybutton;
    private Button girlButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boybutton= findViewById(R.id.button2);
        girlButton= findViewById(R.id.button);


        boybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),secondActivity.class);
                intent.putExtra("genderType","boy");
                startActivity(intent);
            }
        });


girlButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(),secondactivitygirl.class);
        intent.putExtra("genderType","girl");
        startActivity(intent);

    }
});


    }


}
