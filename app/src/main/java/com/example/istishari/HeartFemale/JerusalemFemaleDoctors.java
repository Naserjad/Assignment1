package com.example.istishari.HeartFemale;

import com.example.istishari.R;

public class JerusalemFemaleDoctors {
    private String name;
    private String description;
    private int ImageId;

    public JerusalemFemaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final JerusalemFemaleDoctors[] doctors={
            new JerusalemFemaleDoctors("Dr. Catherine M. Otto, MD","Catherine Otto is the J. Ward Kennedy-Hamilton Endowed Chair in Cardiology, Professor of Medicine and Director of the Heart Valve Clinic at the University Of Washington School Of Medicine in Seattle, Washington. She is recognized internationally as an expert in the diagnosis and management of heart valve disease, Marfan syndrome and other inherited structural heart conditions. ", R.drawable.cath),


    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    @Override
    public String toString() {
        return name;
    }
}
