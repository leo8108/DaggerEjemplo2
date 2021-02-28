package com.leonardo.daggerejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.leonardo.daggerejemplo2.models.Coche;
import com.leonardo.daggerejemplo2.models.Motor;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    TextView txt1;

    @Named("diesel")
    @Inject
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= findViewById(R.id.textView1);
        ((MotorApplication)getApplication()).getMotorComponente().inject(MainActivity.this);
        txt1.setText(motor.getTipoMotor());

        Toast.makeText(MainActivity.this,coche.getMotor(),Toast.LENGTH_LONG).show();
    }
}