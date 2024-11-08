package com.example.istishari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.istishari.HeartFemale.FemaleActivity;
import com.example.istishari.HeartMale.MaleActivity;
import com.example.istishari.PsyMale.SMaleActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner problemSpn;
    private EditText edtAns;
    private RadioButton MaleRad;
    private RadioButton FemRad;
    private CheckBox TermsBox;
    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtAns=findViewById(R.id.edtAns);
        MaleRad=findViewById(R.id.MaleRad);
        FemRad=findViewById(R.id.FemRad);
        TermsBox=findViewById(R.id.TermsBox);
        btnSearch=findViewById(R.id.btnSearch);
        Spinner ProblemSpn=findViewById(R.id.ProblemSpn);
        ProblemSpn.setOnItemSelectedListener(this);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TermsBox.isChecked()) {
                    if ((ProblemSpn.getSelectedItem().toString().equals("Heart Problems")) && MaleRad.isChecked()) {

                        Intent intent=new Intent(MainActivity.this, MaleActivity.class);

                        startActivity(intent);
                    }
                    if ((ProblemSpn.getSelectedItem().toString().equals("Heart Problems")) && FemRad.isChecked()) {

                        Intent intent=new Intent(MainActivity.this, FemaleActivity.class);

                        startActivity(intent);
                    }
                    if ((ProblemSpn.getSelectedItem().toString().equals("psychological impacts")) && MaleRad.isChecked()) {

                        Intent intent=new Intent(MainActivity.this, SMaleActivity.class);

                        startActivity(intent);
                    }
                    if ((ProblemSpn.getSelectedItem().toString().equals("psychological impacts")) && FemRad.isChecked()) {

                       // Intent intent=new Intent(MainActivity.this, FMaleActivity.class);
                      //  intent.putExtra("result",result);
                      //  startActivity(intent);
                    }

                }
                else{
                    Toast.makeText(MainActivity.this,"Please CheckBox Terms and Conditions",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this,adapterView.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}