package edu.amsterdamtourr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by edu on 7/10/2017.
 */

public class SectionAdapter extends ArrayAdapter<Section>{
    private int mColorResourceId;
    public SectionAdapter(Context context, ArrayList<Section> sections) {
        super(context, 0, sections);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.section_design, parent, false);
        }
        Section currentSection = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView imageDescription = (TextView) listItemView.findViewById(R.id.imageDescription);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        imageDescription.setText(currentSection.getImageDescription());



        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentSection.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSection.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }




        return listItemView;
    }
}
