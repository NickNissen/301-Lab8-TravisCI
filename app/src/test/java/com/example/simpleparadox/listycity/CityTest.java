package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CityTest {
    private City city;

    @BeforeEach
    void setup() {
        this.city = new City("Hinton", "Alberta");
    }

    @Test
    void isRealCityTest() {
        assertTrue(city.realCity("Hinton"));
    }

}
