package com.github.takahirom.dagger_simple;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class CoffeeMaker {
    @Inject
    Heater heater;
    @Inject
    Pump pump;

    @Inject
    public CoffeeMaker() {
    }
}
