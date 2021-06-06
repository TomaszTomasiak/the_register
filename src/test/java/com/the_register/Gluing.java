package com.the_register;

public class Gluing implements Place_type{
    private String placeName = "Gluing";
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
