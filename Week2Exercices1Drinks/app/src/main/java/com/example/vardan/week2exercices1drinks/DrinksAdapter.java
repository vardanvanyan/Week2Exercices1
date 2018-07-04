package com.example.vardan.week2exercices1drinks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DrinksAdapter extends ArrayAdapter<Drinks> {

    private Context context;
    private List<Drinks> list;
    private int layoutId;

    DrinksAdapter(@NonNull Context context, int resource,
                  @NonNull List<Drinks> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.layoutId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(layoutId, parent, false);
        }

        final Drinks drinks = list.get(position);
        ImageView drinksImage = listItem.findViewById(R.id.image);
        TextView drinksName1 = listItem.findViewById(R.id.text1);
        TextView drinkName2 = listItem.findViewById(R.id.text2);
        TextView drinkName3 = listItem.findViewById(R.id.text3);

        drinksName1.setText(drinks.getName());
        drinkName2.setText(drinks.getText());
        drinkName3.setText(drinks.getComment());
        Picasso.get().load(drinks.getImageUrl()).into(drinksImage);
        return listItem;
    }
}
