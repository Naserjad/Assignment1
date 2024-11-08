package com.example.istishari.HeartMale;

import com.example.istishari.R;

public class NablusMaleDoctors {
    private String name;
    private String description;
    private int ImageId;

    public NablusMaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final NablusMaleDoctors[] doctors={
            new NablusMaleDoctors("Dr Sajed Majadlah","Dr. Sajed Majadlah is an Consultant Interventional Cardiologist" +
                    "Dr. Sajid Majadla has been practicing medicine since 2005 and is currently a consultant in cardiology and interventional cardiology at An-Najah National University Hospital.\n" +
                    "He completed his general medical degree at the University of Monastir in Tunisia in 2005. He further specialized in cardiology and interventional cardiology in Tunisia and at the University of Paris Diderot. He also completed his sub-specialty training in interventional cardiology at the University of Paris Descartes. Dr. Sajid Majadla is a member of the scientific committee in the administrative board of the Palestinian Cardiac Society.", R.drawable.sajed)


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
