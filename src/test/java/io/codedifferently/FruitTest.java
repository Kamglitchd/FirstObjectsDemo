package io.codedifferently;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FruitTest {
    @Test public void constructorTest(){
        String type= "pear";
        int energy=20;
        Fruit testFruit=new Fruit(type, energy);
        String actualType=testFruit.getType();
        int actualEnergy=testFruit.getEnergy();
        assertEquals(type, actualType);
        assertEquals(energy, actualEnergy);
    }
}