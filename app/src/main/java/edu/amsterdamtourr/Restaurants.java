package edu.amsterdamtourr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_list);
        ArrayList<Section> sections = new ArrayList<Section>();
        sections.add(new Section(R.drawable.apart_pub, getString(R.string.ApartPub)));
        sections.add(new Section(R.drawable.cafe_panache, getString(R.string.Cafe_Panache)));
        sections.add(new Section(R.drawable.la_cage, getString(R.string.LaCage)));
        sections.add(new Section(R.drawable.mauro_pub, getString(R.string.MauroPub)));
        sections.add(new Section(R.drawable.the_harbour_park, getString(R.string.TheHarbourPub)));


        SectionAdapter adapter = new SectionAdapter(this, sections);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
