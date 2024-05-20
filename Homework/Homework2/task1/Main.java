package Homework.task2.one;

public class Main {
    public static void main(String[] args) {
        Sedan car1 = new Sedan(6, 150, "Высокий");
        Truck car2 = new Truck(2, 200, 1000);

        car1.start();
        car1.getFuelType();
        System.out.println("Уровень комфорта: " + car1.getLuxuryLevel());
        car1.getNumberOfDoors();
        car1.getTrunkCapacity();
        car1.stop();

        car2.start();
        car2.getFuelType();
        System.out.println("Максимальная загрузка грузовика: " + car2.getMaxLoadCapacity());
        car2.getNumberOfDoors();
        car2.getTrunkCapacity();
        car2.stop();
    }
}
