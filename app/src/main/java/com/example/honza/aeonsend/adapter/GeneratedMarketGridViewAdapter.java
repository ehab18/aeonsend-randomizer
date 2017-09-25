package com.example.honza.aeonsend.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.honza.aeonsend.R;
import com.example.honza.aeonsend.cards.Card;
import com.example.honza.aeonsend.utils.Constants;

/**
 * Created by honza on 25.9.17.
 */

public class GeneratedMarketGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private Card[] cards;

    public GeneratedMarketGridViewAdapter(Context mContext, Card[] cards) {
        this.mContext = mContext;
        this.cards = cards;
    }

    @Override
    public int getCount() {
        return cards.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        // Get view for one character card
        Card card = cards[position];

        if (view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.fragment_gridview_item, null);
        }
        // TODO bullshit value
        final ImageView imageView = view.findViewById(R.id.fragment_gridview_image);
//        final TextView textView = view.findViewById(R.id.fragment_gridview_text);
        imageView.setImageResource(view.getResources().getIdentifier(card.getPicture(), Constants.DRAWABLEDEFTYPE, Constants.PACKAGENAME));
//        textView.setText(card.getName());

        return view;
    }
}