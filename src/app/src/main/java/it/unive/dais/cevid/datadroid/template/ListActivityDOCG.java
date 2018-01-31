package it.unive.dais.cevid.datadroid.template;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;


public class ListActivityDOCG extends AppCompatActivity {

    // Declare Variables
    ListView list;
    ListVIewAdapter adapter;
    String[] vini;
    String[] comuni;
    String[] colore;
    String[] gazzufficiale;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        // Generate sample data into string arrays
        vini = new String[] { "Amarone di Valpolicella", "Amarone di Valpolicella Classico", "Amarone di Valpolicella Valpantena", "Bardolino Superiore", "Bardolino Superiore Classico", "Colli Asolani Prosecco", "Colli di Conegliano", "Colli di Conegliano Refrontolo Passito","Colli di Conegliano Torchiato di Fregona","Colli Euganei Fior d'Arancio","Conegliano Valdobbiadene Prosecco","Conegliano Valdobbiadene Prosecco Superiore di Cartizze","Friularo di Bagnoli","Friulano di Bagnoli Classico",
        "Lison","Lison Classico","Montello Rosso","Piave Malanotte","Recioto dei Gambellara","Recioto Soave","Recioto Soave Classico","Recioto Valpolicella","Recioto Valpolicella Classico","Soave Superiore","Soave Superiore Classico"};

        comuni = new String[] { "Marano di Valpolicella, Fumane, Negrar, Sant'Ambrogio di Valpolicella, San Pietro in Cariano, Dolce, Verona, Lavagno, Mezzane di Sotto, Tregnago, Illasi, Colognola ai Colli, Cazzano di Tramigna, Grezzana, Pescantina, Cerro Veronese, San Mauro di Saline, Montecchia di Crosara.",
                "Marano di Valpolicella, Fumane, Negrar, Sant'Ambrogio di Valpolicella, San Pietro in Cariano.", "Grezzana, Verona.", "Bardolino, Garda, Lazise, Affi, Costermano, Cavaion Veronese, Torri del Benaco, Caprino Veronese, Rivoli Veronese, Pastrengo, Bussolengo, Sona, Sommacampagna, Castelnuovo del Garda, Peschiera del Garda, Valeggio sul Mincio",
        "Bardolino, Garda, Lazise, Affi, Costermano, Cavaion Veronese.","Castelcucco, Cornuda, Monfumo, Asolo, Caerano di San Marco, Cavaso del Tomba, Crocetta del Montello, Fonte, Giavera del Montello, Maser, Montebelluna, Nervesa della Battaglia, Paderno del Grappa, Pederobba, Possagno, San Zenone degli Ezzelini, Volpago del Montello.",
        "Conegliano, Susegana, Pieve di Soligo, Farra di Soligo, Refrontolo, San Pietro di Feletto, Miane, Follina, Cison di Valmarino, Revine Lago, Tarzo, Vittorio Veneto, Fregona, Sarmede, Cappella Maggiore, Cordignano, Colle Umberto, San Fior, San Vendemiano, Vidor.",
        "Refrontolo, Pieve di Soligo, San Pietro di Feletto.",
        "Fregona, Sarmede, Cappella Maggiore",
        "Arqua Petrarca, Galzignano Terme, Torreglia, Abano Terme, Montegrotto Terme, Battaglia Terme, Due Carrare, Monselice, Baone, Este, Cinto Euganeo, Lozzo Atestino, Vo, Rovolon, Cervarese Santa Croce, Teolo, Selvazzano Dentro",
        "Conegliano, San Vendemiano, Colle Umberto, Vittorio veneto, Tarzo, Cison di Valmarino, San Pietro di Feletto, Refrontolo, Susegana, Pieve di Soligo, Farra di Soligo, Follina, Miane, Vidor, Valdobbiadene",
        "Valdobbiadene",
        "Agna, Arre, Bagnoli di Sopra, Battaglia Terme, Bovolenta, Candiana, Due Carrare, Cartura, Conselve, Monselice, Pernumia, San Pietro Viminario, Terrassa Padovana, Tribano.",
        "Bagnoli di Sopra",
        "Annone Veneto, Cinto Caomaggiore, Gruaro, Fossalta di Portogruaro, Pramaggiore, Teglio Veneto, Caorle, Concordia Sagittaria, Portogruaro, San Michele al Tagliamento, San Stino di Livenza, Meduna di Livenza, Motta di Livenza, Chions, Cordovado, Pravisdomini, Azzano Decimo, Morsano al Tagliamento, Sesto al Reghena.",
        "Portogruaro, Pramaggiore, Annone Veneto, San Stino di Livenza, Cinto Caomaggiore.",
        "Castelcucco, Cornuda, Monfumo, Asolo, Borso del Grappa, Caerano di San Marco, Cavaso del Tomba, Crespano del Grappa, Crocetta del Montello, Fonte, Giavera del Montello, Maser, Montebelluna, Nervesa della battaglia, Paderno del Grappa, Pederobba, San Zenone degli Ezzelini, Volpago del Montello.",
        "Arcade, Breda di Piave, Casale sul Sile, Cessalto, Chierano, Cimadolmo, Codognè, Fontanelle, Godega di Sant'Urbano, Gorgo al Monticano, Mareno di Piave, Maserada sul Piave, Monastier di Treviso, Oderzo, Ormelle, Ponte di Piave, Ponzano Veneto, Portobuffole, Povegliano, Roncade, Salgareda, San Biagio di Callalta, San Fior, San Polo di Piave, Spresiano, Vazzola, Zenson di Piave, Carbonera, Casier, Gaiarine, Mansuè, Mogliano veneto, Orsago, Preganziol, Silea, Villorba, Colle Umberto, Conegliano, Cordignano, Giavera del Montello, Montebelluna, Motta di Livenza, Nervesa della Battaglia, Paese, San Vendemiano, Susegana, Trevignano, Vittorio Veneto, Volpago del Montello, Fossalta di Piave, Marcon, Meolo, Noventa di Piave, Quarto d'Altino, San Donà di Piave, Venezia, Ceggia, Eraclea, Jesolo, Musile di Piave, Torre di Mosto.",
        "Gambellara, Montebello Vicentino, Zermeghedo, Montorso Vicentino",
        "Soave, Monteforte d'Alpone, San Martino Buon Albergo, Mezzane di Sotto, Ronca,  Montecchia di Crosara, San Giovanni Ilarione, Cazzano di Tramigna, Colognola ai Colli, Caldiero, Illasi, Lavagno.",
        "Soave, Monteforte d'Alpone.",
        "Marano di Valpolicella, Fumane, Negrar, Sant'Ambrogio di Valpolicella, San Pietro in Cariano, Dolce, Verona, San Martino Buon Albergo, Lavagno, Mezzane di Sotto, Tregnano, Illasi, Colognola ai Colli, Cazzano di Tramigna, Grezzana, Pescantina, Cerro Veronese, San Mauro di Saline, Montecchia di Crosara.",
        "Negrar, Marano di Valpolicella, Fumane, Sant'Ambrogio di Valpolicella, San Pietro in Cariano, Grezzana, Verona.",
        "Soave, Monteforte d'Alpone, San Martino Buon Albergo, Mezzane di Sotto, Ronca, Montecchia di Crosara, San Giovanni Ilarione, Cazzano di Tramigna, Colognola ai Colli, Caldiero, Illasi, Lavagno.",
        "Soave, Monteforte d'Alpone."};

        colore = new String[] { "Rosso", "Rosso", "Rosso", "Rosso", "Rosso", "Bianco", "Bianco","Bianco","Bianco","Bianco","Bianco","Bianco","Rosso","Rosso","Bianco","Bianco","Rosso","Rosso","Bianco","Bianco","Bianco","Rosso","Rosso","Bianco","Bianco"};

        gazzufficiale = new String[] {"n. 85 del 13/04/2010", "n. 85 del 13/04/2010", "n. 85 del 13/04/2010","n. 275 del 25/11/2011","n. 275 del 25/11/2011","n. 39 del 17/02/2010","n. 231 del 04/10/2011","n. 231 del 04/10/2011","n. 231 del 04/10/2011","n. 4 del 07/01/2011","n. 232 del 04/10/2010","n.232 del 04/10/2010","n. 276 del 26/11/2011","n. 276 del 26/11/2011","n. 4 del 07/01/2011",
        "n. 4 del 07/01/2011","n. 248 del 24/10/2011","n. 4 del 07/01/2011","n. 196 del 22/08/2008","n. 283 del 03/12/2010","n. 283 del 03/12/2010","n. 85 del 13/04/2010","n. 85 del 13/04/2010","n. 283 del 03/12/2010","n. 283 del 03/12/2010"};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listView2);


        // Pass results to ListViewAdapter Class
        adapter = new ListVIewAdapter(ListActivityDOCG.this, vini);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(ListActivityDOCG.this, SingleItemVIew.class);
                // Pass all data rank
                i.putExtra("vini", vini);
                // Pass all data country
                i.putExtra("comuni", comuni);
                // Pass all data population
                i.putExtra("colore", colore);
                i.putExtra("gazzufficiale", gazzufficiale);
                // Pass listview item click position
                i.putExtra("position", position);
                // Open SingleItemView.java Activity
                startActivity(i);
            }

        });
    }
}