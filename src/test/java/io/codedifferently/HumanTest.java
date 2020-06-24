package io.codedifferently;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HumanTest {
    @Test
    //Tests basic construction of a Human Object
    public void constructorTest(){
        String first="Terry";
        String last="Bull";
        int energy=50;

        Human testHuman=new Human(first, last);
        String actualFirst= testHuman.getFirstName();
        String actualLast= testHuman.getLastName();
        int actualEnergy=testHuman.getEnergy();

        assertEquals(first, actualFirst);
        assertEquals(last, actualLast);
        assertEquals(energy, actualEnergy);

    }
    @Test
    public void eatTest(){
        Fruit pineapple=new Fruit("Pineapple", 10);
        int expectedEnergy=60;
        Human testHuman=new Human("Barney", "Rubble");
        testHuman.eat(pineapple);
        int actualEnergy=testHuman.getEnergy();
        assertEquals(expectedEnergy, actualEnergy);
    }
    @Test
    public void workTest(){
        Human testHuman = new Human("Fred", "Flintstone");
        int expectedEnergy=30; 
        testHuman.work(2);
        int actualEnergy=testHuman.getEnergy();
        assertEquals(expectedEnergy, actualEnergy);

    }
    @Test public void energyMaxTest(){
        Human testHuman=new Human("fName", "lName");
        Fruit testFruit1=new Fruit("f",20);
        Fruit testFruit2=new Fruit("f",20);
        Fruit testFruit3=new Fruit("f",20);
        Human.maxEnergy=100;
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy=testHuman.getEnergy();
        assertEquals(100, actualEnergy);
    }
    @Test public void workMi(){
        Human testHuman= new Human("fName", "lName");
        testHuman.work(6);
        int actualEnergy=testHuman.getEnergy();
        assertEquals(50, actualEnergy);
    }
    @Test public void maxEnergyChangeTest(){
        Human h1=new Human("fName", "lName");
        Fruit testFruit1=new Fruit("f",20);
        Fruit testFruit2=new Fruit("f",20);
        Fruit testFruit3=new Fruit("f",20);
        Human.maxEnergy=150;
        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);
        int actualEnergy=h1.getEnergy();
        assertEquals(110, actualEnergy);

    }
}