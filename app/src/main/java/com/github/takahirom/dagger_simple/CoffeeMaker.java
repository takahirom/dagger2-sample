package com.github.takahirom.dagger_simple;

import javax.inject.Inject;
import javax.inject.Singleton;

class CoffeeMaker {
    @Inject
    Heater heater;

    @Inject
    public CoffeeMaker() {
    }
}
