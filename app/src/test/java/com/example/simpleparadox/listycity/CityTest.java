package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class CityTest {
    @Test
    void isRealCityTest() {
        assertTrue(realCity("Hinton"));
    }

}
