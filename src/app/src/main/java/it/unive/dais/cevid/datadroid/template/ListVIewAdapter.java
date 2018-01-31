package it.unive.dais.cevid.datadroid.template;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListVIewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] vini;
    LayoutInflater inflater;

    public ListVIewAdapter(Context context, String[] rank) {
        this.context = context;
        this.vini = rank;
       }

    @Override
    public int getCount() {
        return vini.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtrank;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.listview_item, parent, false);

        // Locate the TextViews in listview_item.xml
        txtrank = (TextView) itemView.findViewById(R.id.vini);
        // Capture position and set to the TextViews
        txtrank.setText(vini[position]);

        return itemView;
    }
}