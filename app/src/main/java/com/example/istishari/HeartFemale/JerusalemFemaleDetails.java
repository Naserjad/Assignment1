package com.example.istishari.HeartFemale;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.istishari.R;

public class JerusalemFemaleDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_male_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent=getIntent();
        int id=(int)intent.getExtras().get("Doctor_id");
        JerusalemFemaleDoctors FemaleDoctors=JerusalemFemaleDoctors.doctors[id];
        ImageView image=(ImageView)findViewById(R.id.MaleImg);
        image.setImageResource(FemaleDoctors.getImageId());

        TextView MtxtName=(TextView)findViewById(R.id.MtxtName);
        TextView MtxtDesc=(TextView)findViewById(R.id.MtxtDesc);

        MtxtName.setText(FemaleDoctors.getName());
        MtxtDesc.setText(FemaleDoctors.getDescription());


    }
}