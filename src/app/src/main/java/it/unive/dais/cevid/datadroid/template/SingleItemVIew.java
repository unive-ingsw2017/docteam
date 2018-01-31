package it.unive.dais.cevid.datadroid.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SingleItemVIew extends AppCompatActivity {

    // Declare Variables
    TextView txtvini;
    TextView txtcomuni;
    TextView txtcolore;
    TextView txtgazzufficiale;
    String[] vini;
    String[] comuni;
    String[] colore;
    String[] gazzufficiale;

    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
        // Retrieve data from MainActivity on listview item click
        Intent i = getIntent();
        // Get the listview item click position
        position = i.getExtras().getInt("position");
        // Get the list of rank
        vini = i.getStringArrayExtra("vini");
        // Get the list of country
        comuni = i.getStringArrayExtra("comuni");
        // Get the list of population
        colore = i.getStringArrayExtra("colore");
        gazzufficiale = i.getStringArrayExtra("gazzufficiale");

        // Locate the TextViews in singleitemview.xml
        txtvini = (TextView) findViewById(R.id.vini);
        txtcomuni = (TextView) findViewById(R.id.comuni);
        txtcolore = (TextView) findViewById(R.id.colore);
        txtgazzufficiale = (TextView) findViewById(R.id.gazzufficiale);

        // Load the text into the TextViews followed by the position
        txtvini.setText(vini[position]);
        txtcomuni.setText(comuni[position]);
        txtcolore.setText(colore[position]);
        txtgazzufficiale.setText(gazzufficiale[position]);
    }
}