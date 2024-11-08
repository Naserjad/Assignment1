package com.example.istishari.HeartFemale;

import com.example.istishari.R;

public class RamallahFemaleDoctors {
    private String name;
    private String description;
    private int ImageId;

    public RamallahFemaleDoctors(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        ImageId = imageId;
    }
    public static final RamallahFemaleDoctors[] doctors={
            new RamallahFemaleDoctors("Dr. Carole A. Warnes, MD","Carole A. Warnes, M.D., is a cardiologist in the Division of Structural Heart Disease, Department of Cardiovascular Medicine with a joint appointment in the Division of Pediatric Cardiology at Mayo Clinic. Dr. Warnes joined the staff of Mayo Clinic in 1987 and founded the Adult Congenital Heart Disease Clinic, which she directed for 27 years. She holds the academic rank of professor of medicine. She is recognized with the distinction of the Penske Foundation Professorship in Clinical Medicine in Honor of Ian D. Hay, M.D., Ph.D., and J. Eileen Hay, M.B., Ch.B. ", R.drawable.carole),


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
