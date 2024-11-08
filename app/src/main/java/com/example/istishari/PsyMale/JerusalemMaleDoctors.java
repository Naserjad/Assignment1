package com.example.istishari.PsyMale;

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
            new JerusalemMaleDoctors("Kevin Rose","Hello I am a psychotherapist, counsellor and Cognitive Behaviour Therapist offering counselling in the Finchley, Golders Green, Hendon, Barnet, North London area and online. I have helped many people from different backgrounds in my thirty years as a practicing therapist and I work with a range of therapies depending on what is best for the client. If you come to see me the first session is £60 and I have a sliding" +
                    " scale of fees of £60-£85.", R.drawable.kevin),

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
