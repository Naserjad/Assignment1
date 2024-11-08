package com.example.istishari.HeartFemale;

import com.example.istishari.R;

public class NablusFemaleDoctors {
    private String name;
    private String description;
    private int ImageId;

    public NablusFemaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final NablusFemaleDoctors[] doctors={
            new NablusFemaleDoctors("Dr. Laura J. Olivieri, MD","Laura Olivieri, M.D., is a cardiologist at Children’s National. She is also Associate Professor of Pediatrics (with Award of Tenure) at the George Washington University School of Medicine and Health Sciences. She has been an author on 61 peer reviewed articles and participated in 1 clinical trial in the past 15 years. \n" +
                    "\n" +
                    "Follow her work on Twitter: @ljolivieri ", R.drawable.laura),


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
