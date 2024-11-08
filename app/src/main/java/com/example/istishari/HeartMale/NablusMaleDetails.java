package com.example.istishari.HeartMale;

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

public class NablusMaleDetails extends AppCompatActivity {

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
        NablusMaleDoctors maleDoctors=NablusMaleDoctors.doctors[id];
        ImageView image=(ImageView)findViewById(R.id.MaleImg);
        image.setImageResource(maleDoctors.getImageId());

        TextView MtxtName=(TextView)findViewById(R.id.MtxtName);
        TextView MtxtDesc=(TextView)findViewById(R.id.MtxtDesc);

        MtxtName.setText(maleDoctors.getName());
        MtxtDesc.setText(maleDoctors.getDescription());


    }
}