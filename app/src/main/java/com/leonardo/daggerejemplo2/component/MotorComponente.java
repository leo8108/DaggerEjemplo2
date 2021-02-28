package com.leonardo.daggerejemplo2.component;

//puente de los modulos creados y la parte del codigo que solicitara esos objetos

import com.leonardo.daggerejemplo2.MainActivity;
import com.leonardo.daggerejemplo2.modules.MotorModule;
import com.leonardo.daggerejemplo2.scope.PerActivity;

import dagger.Component;

@PerActivity
@Component(modules = {MotorModule.class})
public interface MotorComponente {

    void inject(MainActivity mainActivity);

}
