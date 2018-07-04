package com.example.vardan.week2exercices1drinks;

import android.content.Context;
import java.util.ArrayList;

public class DrinksProvider {
    public static ArrayList<Drinks> getDrinkProvider(Context context) {
        ArrayList<Drinks> drinkProviderList = new ArrayList<>();
        Drinks drinks1 = new Drinks();
        drinks1.setName(context.getString(R.string.mojo));
        drinks1.setText(context.getString(R.string.cocktail));
        drinks1.setComment(context.getString(R.string.alcoholic));
        drinks1.setImageUrl(context.getString(R.string.mojo_url));
        drinks1.setInternetUrl(context.getString(R.string.mojo_wikipedia_url));

        Drinks drinks2 = new Drinks();
        drinks2.setName(context.getString(R.string.manhattan));
        drinks2.setText(context.getString(R.string.cocktail));
        drinks2.setComment(context.getString(R.string.alcoholic));
        drinks2.setImageUrl(context.getString(R.string.manhatten_url));
        drinks2.setInternetUrl(context.getString(R.string.manhatten_wikipedia_url));

        Drinks drinks3 = new Drinks();
        drinks3.setName(context.getString(R.string.orange_juice));
        drinks3.setText(context.getString(R.string.fresh));
        drinks3.setComment(context.getString(R.string.non_alcoholic));
        drinks3.setImageUrl(context.getString(R.string.orange_url));
        drinks3.setInternetUrl(context.getString(R.string.orange_wikipedia_url));

        Drinks drinks4 = new Drinks();
        drinks4.setName(context.getString(R.string.whisky));
        drinks4.setText(context.getString(R.string.beverage));
        drinks4.setComment(context.getString(R.string.alcoholic));
        drinks4.setImageUrl(context.getString(R.string.whisky_url));
        drinks4.setInternetUrl(context.getString(R.string.whisky_wikipedia_url));

        Drinks drinks5 = new Drinks();
        drinks5.setName(context.getString(R.string.rum));
        drinks5.setText(context.getString(R.string.beverage));
        drinks5.setComment(context.getString(R.string.alcoholic));
        drinks5.setImageUrl(context.getString(R.string.rum_url));
        drinks5.setInternetUrl(context.getString(R.string.rum_wikipedia_url));

        Drinks drinks6 = new Drinks();
        drinks6.setName(context.getString(R.string.blue_lagoon));
        drinks6.setText(context.getString(R.string.cocktail));
        drinks6.setComment(context.getString(R.string.non_alcoholic));
        drinks6.setImageUrl(context.getString(R.string.blue_lagoon_url));
        drinks6.setInternetUrl(context.getString(R.string.blue_lagoon_wikipedia_url));

        drinkProviderList.add(drinks1);
        drinkProviderList.add(drinks2);
        drinkProviderList.add(drinks3);
        drinkProviderList.add(drinks4);
        drinkProviderList.add(drinks5);
        drinkProviderList.add(drinks6);
        return drinkProviderList;
    }
}
