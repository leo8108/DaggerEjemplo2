package com.leonardo.daggerejemplo2.modules;

//se encarga de proveer a nuestra actividad todas las instancias necesarias para que funcione  nuestras clase
//crear modulos para que dagger sepa como crear los objetos que se requeriran mas adelante

import com.leonardo.daggerejemplo2.models.Coche;
import com.leonardo.daggerejemplo2.models.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor provideMotorDiesel(){

        return new Motor("Diesel");

    }

    @Named("gasolina")
    @Provides
    public Motor provideMotorGasolina(){

        return new Motor("Gasolina");
    }


    @Provides
    public Coche provideCoche(@Named("gasolina")Motor motor){

        return new Coche(motor);

    }


}
