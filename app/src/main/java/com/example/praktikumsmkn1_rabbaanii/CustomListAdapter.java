package com.example.praktikumsmkn1_rabbaanii;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity contex;
    private final String[] namasahabat;
    private final String[] subtitle;
    private final Integer[] gambarsahabat;

    public CustomListAdapter(Activity contex, String[] namasahabat, String[] subtitle, Integer[] gambarsahabat) {
        super(contex, R.layout.list_item, namasahabat);
        this.contex = contex;
        this.namasahabat = namasahabat;
        this.subtitle = subtitle;
        this.gambarsahabat = gambarsahabat;
    }

    public View getView(int posisi, View view, ViewGroup parent){
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView title = rowView.findViewById(R.id.textview1);
        TextView subtitle1 = rowView.findViewById(R.id.textview2);
        ImageView images1 = rowView.findViewById(R.id.imageview1);

        title.setText(namasahabat[posisi]);
        subtitle1.setText(subtitle[posisi]);
        images1.setImageResource(gambarsahabat[posisi]);

        return rowView;
    }
}
