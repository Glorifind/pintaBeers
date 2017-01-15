package com.pintabestbeers.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pintabestbeers.R;
import com.pintabestbeers.model.BeerListItem;

import java.util.List;

/**
 * Created by Adam on 15.01.2017.
 */

public class BeerListAdapter extends RecyclerView.Adapter<BeerListAdapter.BeerListHolder> {

    private List<BeerListItem> data;
    private LayoutInflater layoutInflater;

    public BeerListAdapter(List<BeerListItem> listData, Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.data = listData;
    }

    @Override
    public BeerListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.row_beer_list,parent,false);
        return new BeerListHolder(view);
    }

    @Override
    public void onBindViewHolder(BeerListHolder holder, int position) {
        BeerListItem item = data.get(position);
        holder.beerName.setText(item.getBeerName());
        holder.beerBootleImage.setImageResource(item.getBeerBootleImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //Holder help us to put items into respective places in layout
    class BeerListHolder extends RecyclerView.ViewHolder {

        private TextView beerName;
        private ImageView beerBootleImage;
        private View container;

        public BeerListHolder(View itemView) {
            super(itemView);

            beerName= (TextView) itemView.findViewById(R.id.beerNameTextView);
            beerBootleImage= (ImageView) itemView.findViewById(R.id.beerBottleImageView);
            container = itemView.findViewById(R.id.beerListItemLinearLayout);
        }
    }
}
