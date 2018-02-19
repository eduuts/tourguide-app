package edu.amsterdamtourr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView pictures = (TextView) findViewById(R.id.images);
        pictures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picturestIntent = new Intent(MainActivity.this, Images.class);
                startActivity(picturestIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurant);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        TextView universities = (TextView) findViewById(R.id.universities);
        universities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent universitiesIntent = new Intent(MainActivity.this, Universities.class);
                startActivity(universitiesIntent);
            }
        });
    }
}
