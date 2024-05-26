package Homework.Homework2.task1;

public abstract class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Машина поехала!");
    }

    @Override
    public void stop() {
        System.out.println("Машина тормозит!");
    }

    @Override
    public void getFuelType() {
        System.out.println("Машину заправлять 95 бензином");
    }


    public abstract void getNumberOfDoors();
    public abstract void getTrunkCapacity();

    
}