package edu.amsterdamtourr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_list);

         ArrayList<Section> sections = new ArrayList<Section>();
        sections.add(new Section(R.drawable.picture1, getString(R.string.picture1)));
        sections.add(new Section(R.drawable.picture2, getString(R.string.picture2)));
        sections.add(new Section(R.drawable.picture3, getString(R.string.picture3)));
        sections.add(new Section(R.drawable.picture4, getString(R.string.picture4)));
        sections.add(new Section(R.drawable.picture5, getString(R.string.picture5)));
        sections.add(new Section(R.drawable.picture6, getString(R.string.picture6)));

        SectionAdapter adapter = new SectionAdapter(this, sections);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}


