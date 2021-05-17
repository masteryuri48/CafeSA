package com.example.cafesa.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cafesa.LoginActivity;
import com.example.cafesa.R;
import com.example.cafesa.ShopActivity;
import com.example.cafesa.ViewPagerAdapter;
import com.example.cafesa.viewmodels.ShopViewModel;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    private Button ordernowbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ordernowbtn = (Button) findViewById(R.id.ordernow_btn);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
        ordernowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeFragment.class);
                startActivity(intent);
            }
        });



    }
}