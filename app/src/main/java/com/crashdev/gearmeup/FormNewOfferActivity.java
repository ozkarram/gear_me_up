package com.crashdev.gearmeup;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class FormNewOfferActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_new_offer);
        init();
    }


    private void init() {
        //init date picker
        Spinner spinner = ((Spinner) findViewById(R.id.spinner_type_offer));
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.rent_type,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    findViewById(R.id.ford_desc_servicio).setVisibility(View.VISIBLE);
                    findViewById(R.id.ford_desc_producto).setVisibility(View.GONE);
                } else {
                    findViewById(R.id.ford_desc_servicio).setVisibility(View.GONE);
                    findViewById(R.id.ford_desc_producto).setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
