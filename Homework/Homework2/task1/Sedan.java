package Homework.Homework2.task1;

 public class Sedan extends Car {
    private String luxuryLevel;
    private int numberOfDoors;
    private int trunkCapacity;

    Sedan(int numberOfDoors, int trunkCapacity, String luxuryLevel) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public void getNumberOfDoors() {
        System.out.println("Дверей у Седана: " + numberOfDoors);
    }

    @Override
    public void getTrunkCapacity() {
        System.out.println("Объём багажника у Седана: " + trunkCapacity);
    }

    String getLuxuryLevel() {
        return luxuryLevel;
    }
    
}

