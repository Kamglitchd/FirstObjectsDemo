package io.codedifferently;

public class Human {
    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy= 100;

    public Human(String fName, String lName){
        firstName=fName;
        lastName=lName;
        this.energy=50;
    }
    public void eat(Fruit fruit){
        if (this.energy+fruit.getEnergy()<=maxEnergy){
            this.energy+=fruit.getEnergy();
        }else{
            this.energy=maxEnergy;
            System.out.println("Full of energy");
        }
    }
    public void work(int hours){
        int energySpent=hours*10;
        if(this.energy-energySpent <0){
            System.out.println("Energy too low");
        }else{
            this.energy-=energySpent;
        }
    }
    public int getEnergy(){
        return this.energy;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;

    }
}