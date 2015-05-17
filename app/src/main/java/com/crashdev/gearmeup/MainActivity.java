package com.crashdev.gearmeup;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

import adapter.ViewPagerAdapter;


public class MainActivity extends ActionBarActivity {

    private int imageArra[] = { R.drawable.control1, R.drawable.control2, R.drawable.ctrl1,
            R.drawable.ctrl4, R.drawable.ctrl3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void init() {
        //init date picker
        Spinner spinner = ((Spinner) findViewById(R.id.spinner_days));
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.numbers,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //init viewpager
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, imageArra);
        ViewPager myPager = (ViewPager) findViewById(R.id.pager);
        myPager.setAdapter(viewPagerAdapter);
        myPager.setCurrentItem(0);
    }
}
