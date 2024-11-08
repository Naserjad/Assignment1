package com.example.istishari.PsyMale;

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
            new RamallahMaleDoctors("Dr Edward Bloomfield","Dr Edward Bloomfield is an excellent consultant clinical psychologist and analyst based in London. Treating a wide variety of mental " +
                    "health issues, he specialises in anxiety, depression, and relationship problems." +
                    " He works in a safe space where his patients can learn to understand their thought " +
                    "process and why they feel the way they do. He then uses his experience and training" +
                    "to tailor a strategy for each individual to help them work towards their goals" +
                    " for personal change.", R.drawable.edward),

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
