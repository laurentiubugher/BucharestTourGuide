package com.example.lauru.bucharesttourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    /**
     * Resource ID for the background color for this list of places
     */
    private int bColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        bColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID placeName_text_view.
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.placeName_text_view);

        // Get the Place name from the currentPlace object and set this text on
        // the place name TextView.
        placeTextView.setText(currentPlace.getbPlaceName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        // Get the place address from the currentPlace object and set this text on
        // the address TextView.
        addressTextView.setText(currentPlace.getPlaceAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), bColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and one ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
