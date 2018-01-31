package it.unive.dais.cevid.datadroid.template;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.view.View;

public class ListActivityDOC extends AppCompatActivity {

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
        setContentView(R.layout.activity_list1);
        //botttone per tornare indietro
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        // Generate sample data into string arrays
        vini = new String[] { "Arcole", "Bagnoli", "Bardolino", "Bianco di Custoza", "Breganze", "Colli Berici", "Colli Euganei", "Gambellara", "Lison-Pramaggiore", "Lugana", "Merlara", "Montello - Colli Asolani", "Monti Lessini", "Piave", "Prosecco", "Riviera del Brenta", "Soave", "Terradeiforti", "Valdadige", "Valpolicella", "Valpolicella Ripasso", "Venezia", "Vicenza"};

        comuni = new String[] { "Arcole, Cologna Veneta, Albaredo d'Adige, Zimella, Veronella, Zevio, Belfiore d'Adige, Caldiero, San Bonifacio, Soave, Colognola ai Colli, Monteforte d'Alpone, Lavagno, Pressana, Roveredo di Guà, San Martino Buon Albergo, Lonigo, Sarego, Alonte, Orgiano, Sossano.",
                "Agna, Arre, Bagnoli di Sopra, Battaglia Terme, Bovolenta, Candiana, Due Carrare, Cartura, Conselve, Monselice, Pernumia, S. Pietro Viminario, Terrassa, Tribano",
                "Bardolino, Garda, Lazise, Affi, Costermano, Cavaion, Torri del Benaco, Caprino, Rivoli Veronese, Pastrengo, Bussolengo, Sona, Sommacampagna, Castelnuovo, Peschiera, Valeggio",
                "Sommacampagna, Villafranca di Verona, Valeggio sul Mincio, Peschiera del Garda, Lazise, Castelnuovo del Garda, Pastrengo, Bussolengo, Sona",
                "Breganze, Fara Vicentino, Molvena, Bassano del Grappa, Lugo di Vicenza, Marostica, Mason Vicentino, Montecchio, Precalcino, Pianezze, Salcedo, Sandrigo, Sarcedo, Zugliano",
                "Albettone, Alonte, Altavilla, Arcugnano, Barbarano Vicentino, Brendola, Castegnero, Grancona, Mossano, Nanto, Orgiano, San Germano dei Berici, Sovizzo, Villaga, Zovencedo, Asigliano Veneto, Campiglia dei Berici, Creazzo, Longare, Lonigo, Montebello Vicentino, Montecchio Maggiore, Montegalda, Montegaldella, Monteviale, Sarego, Sossano e Vicenza",
                "Arquà Petrarca, Galzignano Terme, Torreglia, Abano Terme, Montegrotto Terme, Battaglia Terme, Due Carrare, Monselice, Baone, Este, Cinto Euganeo, Lozzo Atestino, Vò, Rovolon, Cervarese S. Croce, Teolo, Selvazzano Dentro",
                "Gambellara, Montebello Vicentino, Montorso, Zermeghedo",
                "Annone Veneto, Cinto Caomaggiore, Gruaro, Fossalta di Portogruaro, Pramaggiore, Teglio Veneto, Caorle, Concordia Sagittaria, Portogruaro, San Michele al Tagliamento, Santo Stino di Livenza, Meduna di Livenza, Motta di Livenza, Chions, Cordovado, Pravisdomini, Azzano Decimo, Morsano al Tagliamento, Sesto al Reghena",
                "Peschiera del Garda",
                "Masi, Castelbaldo, Merlara, Urbana, Casale di Scodosia, Terrazzo, Bevilacqua, Boschi S. Anna, Montagnana",
                "Castelcucco, Cornuda, Monfumo, Asolo, Borso del Grappa, Caerano S. Marco, Cavaso del Tomba, Crespano del Grappa, Crocetta del Montello, Fonte, Giavera del Montello, Maser, Montebelluna, Nervesa della Battaglia, Paderno del Grappa, Pederobba, Possagno, S. Zenone degli Ezzelini, Volpago del Montello",
                "Vestenanova, San Giovanni Ilarione, Montecchia di Crosara, Roncà, Cazzano di Tramigna, Tregnago, Badia Calavena, Arzignano, Castelgomberto, Chiampo, Brogliano, Gambugliano, Trissino, Cornedo, Costabissara, Gambellara, Isola Vicentina, Malo, Marano Vicentino, Monte di Malo, Montebello Vicentino, Montecchio Maggiore, Montorso Vicentino, Nogarole Vicentino, San Vito di Leguzzano, Schio, Zermeghedo",
                "Arcade, Breda di Piave, Casale sul Sile, Cessalto, Chiarano, Cimadolmo, Codognè, Fontanelle, Godega Sant’Urbano, Gorgo al Monticano, Mareno di Piave, Maserada sul Piave, Monastier, Oderzo, Ormelle, Ponte di Piave, Ponzano Veneto, Portobuffolè, Povegliano, Roncade, Salgareda, San Biagio di Callalta, San Fior, San Polo di Piave, Santa Lucia di Piave, Spresiano, Vazzola, Zenson di Piave, Carbonera, Casier, Gaiarine, Mansuè, Mogliano Veneto, Orsago, Preganziol, Silea, Villorba, Colle Umberto, Conegliano, Cordignano, Giavera del Montello, Montebelluna, Motta di Livenza, Nervesa della Battaglia, Paese, San Vendemiano, Susegana, Trevignano, Vittorio Veneto, Volpago del Montello, Fossalta di Piave, Marcon, Meolo, Noventa di Piave, Quarto d’Altino, San Donà di Piave, Venezia, Ceggia, Eraclea, Jesolo, Musile di Piave, Torre di Mosto",
                "Province di Belluno, Gorizia, Padova, Pordenone, Treviso, Trieste, Udine, Venezia e Vicenza",
                "Campagna Lupia, Campolongo Maggiore, Camponogara, Dolo, Fiesso d'Artico, Fossò, Martellago, Mira, Mirano, Noale, Pianiga, Salzano, Santa Maria di Sala, Scorzè, Spinea, Stra, Venezia, Vigonovo, Borgoricco, Cadoneghe, Campo San Martino, Camposampiero, Curtarolo, Limena, Loreggia, Massanzago, Noventa Padovana, Padova, Piove di Sacco, San Giorgio delle Pertiche, San Giorgio in Bosco, Santa Giustina in Colle, Saonara, Trebaseleghe, Vigodarzere, Vigonza, Villa del Conte",
                "Soave, Monteforte d'Alpone, San Martino Buon Albergo, Mezzane di Sotto, Roncà, Montecchia di Crosara, San Giovanni Ilarione, San Bonifacio, Cazzano di Tramigna, Colognola ai Colli, Caldiero, Illasi, Lavagno",
                "Brentino Belluno, Dolcè, Rivoli Veronese, Avio",
                "Brentino Belluno, Dolcè, Rivoli Veronese, Avio",
                "Marano, Fumane, Negrar, S. Ambrogio, S. Pietro in Cariano, Dolcè, Verona, S. Martino Buon Albergo, Lavagno, Mezzane, Tregnago, Illasi, Colognola ai Colli, Cazzano di Tramigna, Grezzana, Pescantina, Cerro Veronese, S. Mauro di Saline, Montecchia di Crosara",
                "Marano, Fumane, Negrar, S. Ambrogio, S. Pietro in Cariano, Dolcè, Verona, S. Martino Buon Albergo, Lavagno, Mezzane, Tregnago, Illasi, Colognola ai Colli, Cazzano di Tramigna, Grezzana, Pescantina, Cerro Veronese, S. Mauro di Saline, Montecchia di Crosara",
                "Province di Venezia e Treviso",
                "Albettone, Alonte, Altavilla Vicentina, Arcugnano, Arzignano, Asigliano Veneto, Barabarano Vicentino, Breganze, Brendola, Cassola, Carrè, Cartigliano, Castegnero, Castelgomberto, Chiuppano, Creazzo, Fara Vicentina, Gambellara, Gambugliano, Grancona, Lonigo, Longare, Malo, Marano Vicentino, Marostica, Mason Vicentino, Molvena, Montebello Vicentino, Montecchio Maggiore, Montecchio Precalcino, Montegalda, Montegaldella, Monteviale, Montorso Vicentino, Mossano, Mussolente, Nanto, Nove, Orgiano, Pianezze, Rosà, Rossano Veneto, Salcedo, Sandrigo, San Germano dei Berici, San Vito di Leguzzano, Sarego, Sarcedo, Schiavon, Sossano, Sovizo, Tezze sul Brenta, Thiene, Villaga, Zanè, Zermienghedo, Zovencedo, Zugliano, Agugliaro, Bassano del Grappa, Brogliano, Caltrano, Calvene, Chiampo, Costabissara, Cogollo del Cengio, Campiglia dei Berici, Costabissara, Cormedo, Dueville, Grumolo delle Abbadesse, Isola Vicentina, Lugo vicentino, Monte di Malo, Nogarole vicentino, Piovene Rocchette, Pove del Grappa, Poiana Maggiore, Romano d'Ezzelino, Quinto vicentino, Schio, Santorso, Torri di Quartesolo, Trissino, Vicenza, Villaverla"
        };

        colore = new String[] { "Rosso, Bianco", "Rosso",
                "Rosso", "Bianco", "Rosso, Bianco", "Rosso, Bianco",
                "Rosso, Bianco", "Bianco", "Rosso, Bianco", "Bianco",
                "Rosso, Bianco", "Rosso, Bianco", "Rosso, Bianco", "Rosso",
                "Bianco", "Rosso, Bianco", "Bianco", "Rosso, Bianco",
                "Rosso, Bianco", "Rosso", "Rosso", "Rosso, Bianco", "Rosso, Bianco"
        };

        gazzufficiale = new String[] {"n. 267 del 16/11/2006", "n. 273 del 23/11/2011", "n. 274 del 24/11/2011", "n. 279 del 30/11/2011", "n 196 del 22/08/2008", "n. 246 del 22/10/2009", "n. 4 del 07/01/2011", "n. 235 del 08/10/2011", "n. 4 del 07/01/2011", "n. 120 del 25/05/2011", "n. 102 del 05/05/2009", "n. 248 del 24/10/2011", "n. 272 del 22/11/2011", "n. 4 del 07/01/2011", "n. 263 del 10/11/2010", "n. 251 del 27/10/2007", "n. 283 del 03/12/2010", "n. 141 del 19*06/2010", "n. 268 del 17/11/2006", "n 85 del 13/04/2010", "n 85 del 13/04/2010", "n. 4 del 07/01/2011", "n. 225 del 26/09/2000"};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listView1);

        // Pass results to ListViewAdapter Class
        adapter = new ListVIewAdapter(ListActivityDOC.this, vini);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(ListActivityDOC.this, SingleItemVIew.class);
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