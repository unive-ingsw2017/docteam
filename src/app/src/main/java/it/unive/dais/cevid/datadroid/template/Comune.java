package it.unive.dais.cevid.datadroid.template;


import com.google.android.gms.maps.model.LatLng;

public class Comune implements MapItem {
    private LatLng position;
    private String comuneName;
    private String comuneDesc;

    public Comune(LatLng position, String comuneName, String comuneDesc){
        this.comuneName=comuneName;
        this.position=position;
        this.comuneDesc=comuneDesc;
    }

    @Override
    public String getTitle(){ return comuneName;}

    @Override
    public String getDescription() { return comuneDesc;}

    @Override
    public LatLng getPosition(){ return position;}

}