package Homework.Homework2.task1;

public class Truck extends Car {
    private int maxLoadCapacity;
    private int numberOfDoors;
    private int trunkCapacity;

    Truck(int numberOfDoors, int trunkCapacity, int maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void getNumberOfDoors() {
        System.out.println("Дверей у Грузовика: " + numberOfDoors);
    }

    @Override
    public void getTrunkCapacity() {
        System.out.println("Объём багажника у Грузовика: " + trunkCapacity);
    }

    int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
    
}
