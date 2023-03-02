package com.improve10x.recepies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class RecipeItemsAdpater extends ArrayAdapter<RecipeItem> {

    public RecipeItemsAdpater(@NonNull Context context, int resource, @NonNull RecipeItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        RecipeItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.recepie_item, parent, false);
        TextView headingTxt = view.findViewById(R.id.heading_txt);
        headingTxt.setText(item.heading);
        TextView subHeadingTxt = view.findViewById(R.id.subheading_txt);
        subHeadingTxt.setText(item.subHeading);
        TextView serialNumTxt = view.findViewById(R.id.serialnum_txt);
        serialNumTxt.setText(item.serialNumber);
        ImageView imageUrl = view.findViewById(R.id.image_url_iv);
        Picasso.get().load(item.imageUrl).into(imageUrl);
        return view;
    }
}
