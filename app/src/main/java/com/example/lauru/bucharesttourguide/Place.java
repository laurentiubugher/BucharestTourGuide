package com.example.lauru.bucharesttourguide;

public class Place {

    /** The address of the place */
    private String bAddress;

    /** The name of the place */
    private String bPlaceName;

    /** Image resource ID for the place */
    private int bImageResourceId;

    /**
     * Create a new Place object.
     */
    public Place(String address, String placeName, int imageResourceId) {
        bAddress = address;
        bPlaceName = placeName;
        bImageResourceId = imageResourceId;
    }

    /**
     * Get the address for the place
     */
    public String getPlaceAddress() {
        return bAddress;
    }

    /**
     * Get the Place name
     */
    public String getbPlaceName() {
        return bPlaceName;
    }

    /**
     * Return the image resource ID of the Place.
     */
    public int getImageResourceId() {
        return bImageResourceId;
    }

}
