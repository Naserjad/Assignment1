package com.example.istishari.PsyMale;

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
            new NablusMaleDoctors("Dr Martyn Pars","My Offer To You: Being heard, understood, believed in and supported. We all need this kind of support at some point in our lives. This is my offer to you. I am an accredited professional registrant counsellor psychotherapist (PNCPS acc.) registered through the British Association of Counselling and Psychotherapy (MBACP reg) which means I am held on the Professional Standards Authority Accredited Register thus ensuring protection to the public. I have a particular interest in those with later in life ADHD diagnosis or if you suspect you might be." +
                    " I am also a professional executive coach.", R.drawable.martyn),

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
