package com.crashdev.gearmeup;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class FormNewOfferActivity extends ActionBarActivity {


    private EditText editTextFormTitle;
    private EditText editTextFormDesc;
    private Spinner spinnerTypeOffer;
    private TextView fordDescServicio;
    private TextView fordDescProducto;
    private EditText editTextFormCity;
    private EditText editTextFormAssurance;
    private EditText editTextFormEmail;
    private EditText editTextFormPhone;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2015-05-17 11:59:05 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        editTextFormTitle = (EditText)findViewById( R.id.editText_form_title );
        editTextFormDesc = (EditText)findViewById( R.id.editText_form_desc );
        spinnerTypeOffer = (Spinner)findViewById( R.id.spinner_type_offer );
        fordDescServicio = (TextView)findViewById( R.id.ford_desc_servicio );
        fordDescProducto = (TextView)findViewById( R.id.ford_desc_producto );
        editTextFormCity = (EditText)findViewById( R.id.editText_form_city );
        editTextFormAssurance = (EditText)findViewById( R.id.editText_form_assurance );
        editTextFormEmail = (EditText)findViewById( R.id.editText_form_email );
        editTextFormPhone = (EditText)findViewById( R.id.editText_form_phone );
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_new_offer);
        findViews();
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
