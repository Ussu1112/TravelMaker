package com.example.ij351.travelmaker;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.mainViewPager);
        fragmentPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);


        //메인 액티비티 만들면서 로그인 액티비티 실행
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);


    }
}