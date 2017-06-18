package com.github.takahirom.dagger_simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

public class MainActivity extends AppCompatActivity {

    private CoffeeShop coffeeShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coffeeShop = DaggerMainActivity_CoffeeShop.create();
        System.out.println(coffeeShop.maker());
        System.out.println(coffeeShop.maker());
    }

    @Singleton
    @Component(modules = DripCoffeeModule.class)
    interface CoffeeShop {
        CoffeeMaker maker();
    }

    @Module
    static class DripCoffeeModule {
        @Provides
        @Named("water")
        static Heater provideHeater() {
            return new ElectricHeater();
        }

        @Provides
        static Pump providePump(Thermosiphon pump) {
            return pump;
        }
    }

}
