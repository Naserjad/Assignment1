package com.example.istishari.HeartMale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.istishari.R;

public class MaleActivity extends AppCompatActivity {
    private TextView txtResult;
    private ListView cityLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_male);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtResult=findViewById(R.id.txtResult);
        String Result=getIntent().getStringExtra("result");
        txtResult.setText(Result);
        cityLst=findViewById(R.id.cityLst);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent =new Intent(MaleActivity.this, RamallahActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent =new Intent(MaleActivity.this, NablusActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent =new Intent(MaleActivity.this, JerusalemMaleActivity.class);
                    startActivity(intent);
                }

            }
        };
        cityLst.setOnItemClickListener(itemClickListener);

    }
}