package com.example.istishari.PsyMale;

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

public class SMaleActivity extends AppCompatActivity {

    private ListView cityLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smale);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //txtResult=findViewById(R.id.txtResult);
       // String Result=getIntent().getStringExtra("result");
        //txtResult.setText(Result);
        cityLst=findViewById(R.id.cityLst);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent =new Intent(SMaleActivity.this, RamallahMaleActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent =new Intent(SMaleActivity.this, NablusMaleActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent =new Intent(SMaleActivity.this, JerusalemPMaleActivity.class);
                   startActivity(intent);
                }

            }
        };
        cityLst.setOnItemClickListener(itemClickListener);

    }
}