package com.example.istishari.HeartMale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.istishari.R;

public class RamallahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ramallah);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayAdapter<RamallahMaleDoctors> listAdapter=new ArrayAdapter<RamallahMaleDoctors>(this, android.R.layout.simple_list_item_1,RamallahMaleDoctors.doctors);
        ListView listView=(ListView)findViewById(R.id.Doctors_list);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Intent intent=new Intent(RamallahActivity.this, RamallahMaleDetails.class);
              intent.putExtra("Doctor_id",(int)id);
              startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}