package com.testapps.sararagab.boyorgirl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
   private Button boybutton;
    private Button girlButton;
    //ca-app-pub-2020667111518171~8001624893
    //ads:adUnitId="ca-app-pub-2020667111518171/5095904730


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-2020667111518171~8001624893");
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
