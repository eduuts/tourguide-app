package edu.amsterdamtourr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Universities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_list);
        ArrayList<Section> sections = new ArrayList<Section>();
        sections.add(new Section(R.drawable.vrije_university, getString(R.string.VU)));
        sections.add(new Section(R.drawable.university_of_amsterdam, getString(R.string.UVA)));
        sections.add(new Section(R.drawable.university_of_applied_sciences, getString(R.string.UAS)));


        SectionAdapter adapter = new SectionAdapter(this, sections);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
