package com.example.istishari;

public class Doctors {

    private String name;
    private String description;
    private int ImageId;

    public Doctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final Doctors[] doctors={
            new Doctors("Mr Mohamed Shaaban","Consultant Laparascope General,and Oncoplastic Surgeon",R.drawable.logo)

    };
}
