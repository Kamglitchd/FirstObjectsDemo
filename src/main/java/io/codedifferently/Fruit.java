package io.codedifferently;

public class Fruit {
    private String type;
    private int energy;
    public Fruit(String type, int energy){
        this.type=type;
        this.energy=energy;
    }

    public String getType() {
        return type;
    }

    public int getEnergy() {
        return energy;
    }
}