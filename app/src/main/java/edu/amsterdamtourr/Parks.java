package edu.amsterdamtourr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_list);
        ArrayList<Section> sections = new ArrayList<Section>();
        sections.add(new Section(R.drawable.park_keukenhof, getString(R.string.ParkKeunkenhof)));

        sections.add(new Section(R.drawable.garden_of_europe, getString(R.string.GardenOfEurope)));
        sections.add(new Section(R.drawable.spring_park, getString(R.string.SpringPark)));
        sections.add(new Section(R.drawable.bicycle_park, getString(R.string.bicyclePark)));

        SectionAdapter adapter = new SectionAdapter(this, sections);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
