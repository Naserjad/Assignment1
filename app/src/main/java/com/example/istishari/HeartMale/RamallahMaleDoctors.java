package com.example.istishari.HeartMale;

import com.example.istishari.R;

public class RamallahMaleDoctors {

    private String name;
    private String description;
    private int ImageId;

    public RamallahMaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final RamallahMaleDoctors[] doctors={
            new RamallahMaleDoctors("Dr Mustafa Saif","Dr. Mustafa Saif is an Internal Medicine Specialist with over 20 years of experience in the medical field." +
                    "EXPERTISE:\n" +
                    "\n" +
                    "Emergency Medicine\n" +
                    "Communicable and non-communicable diseases\n" +
                    "Diagnosis, treatment and/or management of Hypertension, Diabetes with complications, High Cholesterol, Metabolic Syndromes, Thyroid Disorders, Anaemia\n" +
                    "Acute infective conditions involving various systems\"" +
                    "Location\n" +
                    "Istishari Hospiyal ,Ramallah , Palestine", R.drawable.mustafa),
            new RamallahMaleDoctors("Dr Ahmed Naveed","Cardiologist, Interventional cardiologist\n" +
                    "\n" +
                    "One of the leading Cardiologists in the Dubai region comes with over 16 years of experience treating cardiac diseases. Dr. Naveed has Fellowship in Interventional Cardiology and Structural Heart Interventions: St Michael’s Hospital, University of Toronto, Canada. He had a brief stint as Assistant Professor In Cardiology.\n" +
                    "\n" +
                    "20 years of experience"+
                    "Location\n" +
                            "Istishari Hospiyal ,Ramallah , Palestine" +
                            "https://asterhospital.com/doctors/cardiologist/dr-naveed-ahmed",R.drawable.ahmed)

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
