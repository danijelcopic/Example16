package com.danijelcopic.example15dc.activities;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.danijelcopic.example15dc.R;
import com.danijelcopic.example15dc.model.Ingridient;
import com.danijelcopic.example15dc.provider.CategoryProvider;
import com.danijelcopic.example15dc.provider.FoodProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends Activity {

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_relative);

        final int position = getIntent().getIntExtra("position", 0);


        // food - image
        ImageView ivImage = (ImageView) findViewById(R.id.iv_image_jelo);
        InputStream is = null;
        try {
            is = getAssets().open(FoodProvider.getFoodById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // food - name
        TextView jeloName = (TextView) findViewById(R.id.tv_name_jelo);
        jeloName.setText(com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getName());

        // rating bar
        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getRating());

        // food - description
        TextView jeloOpis = (TextView) findViewById(R.id.tv_destription_des);
        jeloOpis.setText(com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getDescription());

        // spinner for category
        Spinner category = (Spinner) findViewById(R.id.sp_category);
        List<String> categories = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int) com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getCategory().getId());

        // ListView for ingridients
        List<Ingridient> ingridients = (FoodProvider.getFoodById(position).getIngridients());
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ingridients);
        ListView listView = (ListView) findViewById(R.id.lv_list_view);
        listView.setAdapter(itemsAdapter);

        // food - calory
        TextView jeloKalorije = (TextView) findViewById(R.id.tv_calorie_des);
        jeloKalorije.setText(com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getCalory());

        // food - price
        TextView jeloCena = (TextView) findViewById(R.id.tv_price);
        String stringdouble = Double.toString(com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getPrice());
        jeloCena.setText(stringdouble);

        // button for order
        Button btnBuy = (Button) findViewById(R.id.bt_button_order);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've bought " + com.danijelcopic.example15dc.provider.FoodProvider.getFoodById(position).getName() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
