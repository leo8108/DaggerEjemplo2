package com.leonardo.daggerejemplo2;


import android.app.Application;

import com.leonardo.daggerejemplo2.component.DaggerMotorComponente;
import com.leonardo.daggerejemplo2.component.MotorComponente;
import com.leonardo.daggerejemplo2.modules.MotorModule;

public class MotorApplication extends Application {

    //nombre de la interfaz
    private MotorComponente motorComponente;

    @Override
    public void onCreate() {
        super.onCreate();
        motorComponente = DaggerMotorComponente.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponente getMotorComponente(){

        return motorComponente;
    }
}
