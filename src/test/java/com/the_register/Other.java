package com.the_register;

public class Other implements Place_type {

    private String placeName = "Cutting";
    private String description;

    @Override
    public String getPlaceName() {
        return placeName;
    }

    @Override
    public String setDescription() {
        return null;
    }
}
