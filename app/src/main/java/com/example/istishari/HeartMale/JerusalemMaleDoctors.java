package com.example.istishari.HeartMale;

import com.example.istishari.R;

public class JerusalemMaleDoctors {
    private String name;
    private String description;
    private int ImageId;

    public JerusalemMaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final JerusalemMaleDoctors[] doctors={
            new JerusalemMaleDoctors("Prof. Ronen Durst","Prof. Ronen Durst\n" +
                    "Specialist in cardiology, lipid disorders and heart valves" +
                    "\n" +
                    "Prof. Ronen Durst is a senior cardiologist at the Hadassah Medical Center Heart Institute. He is currently the Head of the Israeli Society for Research, Prevention and Treatment of Atherosclerosis.\n", R.drawable.ronen)


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
