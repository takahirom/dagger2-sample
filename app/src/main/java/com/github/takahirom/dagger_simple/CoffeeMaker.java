package com.github.takahirom.dagger_simple;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
class CoffeeMaker {
    @Inject
    @Named("water")
    Heater heater;
    @Inject
    Pump pump;
    @Inject
    @Named("sugar")
    boolean isAddSugar;

    @Inject
    public CoffeeMaker() {
    }
}
