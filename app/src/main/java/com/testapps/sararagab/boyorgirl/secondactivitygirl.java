
package com.testapps.sararagab.boyorgirl;

        import android.annotation.TargetApi;
        import android.content.Intent;
        import android.os.Build;
        import androidx.annotation.NonNull;
        import androidx.annotation.RequiresApi;

        import com.google.android.gms.ads.AdListener;
        import com.google.android.material.navigation.NavigationView;

        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import androidx.appcompat.widget.Toolbar;
        import android.view.MenuItem;
        import android.widget.FrameLayout;
        import com.google.android.gms.ads.AdRequest;
        import com.google.android.gms.ads.AdView;

public class secondactivitygirl extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private  Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ovulationfragment movulationfragment;
    private chineseboygirlfragment mchineseboygirlfragment;
    private dietfargment mdietfargment;
    private genderfragment mgenderfragment;
    private pregnancyfragment mpregnancyfragment;
    private  pregnencysyndromefragment mpregnencysyndromefragment;
    private FrameLayout frameLayout;
    private  String genderType;
    private AdView mAdView;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivitygirl);

        if(savedInstanceState==null){
            mpregnancyfragment = new pregnancyfragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentcontainer,mpregnancyfragment).commit();
        }
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }

            @Override
            public void onAdLoaded() {

            }
        });


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.nav_drawer);
        frameLayout = findViewById(R.id.fragmentcontainer);

        Intent intent = getIntent();
        genderType = intent.getStringExtra("genderType");
        frameLayout.setBackground(getApplicationContext().getResources().getDrawable(R.drawable.babypink));

        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //outState.putString("key","Welcome Back");
        super.onSaveInstanceState(outState);       //save state
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Bundle bundle = new Bundle();
        bundle.putString("gender",genderType);
        switch (menuItem.getItemId()){

            case (R.id.ovulation):
                movulationfragment = new ovulationfragment();

                movulationfragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,movulationfragment).commit();
                break;
            case (R.id.pregnancy):

                mpregnancyfragment = new pregnancyfragment();
                mpregnancyfragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,mpregnancyfragment).commit();
                break;
            case (R.id.gender):

                mgenderfragment = new genderfragment();
                mgenderfragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,mgenderfragment).commit();
                break;
            case (R.id.diet_icon):

                mdietfargment = new dietfargment();
                mdietfargment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,mdietfargment).commit();
                break;

            case (R.id.chinesegender):

                mchineseboygirlfragment = new chineseboygirlfragment();
                mchineseboygirlfragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,mchineseboygirlfragment).commit();
                break;
            case (R.id.syndrome_icon):

                mpregnencysyndromefragment = new pregnencysyndromefragment();
                mpregnencysyndromefragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,mpregnencysyndromefragment).commit();
                break;

            case (R.id.share):

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                break;



        }


        return true;
    }
}

