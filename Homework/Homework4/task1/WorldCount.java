package Homework.Homework4.task1;

import java.util.ArrayList;

public class WorldCount {

    public static void main(String[] args) {
        ArrayList<String> count = new ArrayList<>();
        count.add("Россия");
        count.add("США");
        count.add("Китай");

        count.add("Германия");
        count.add("Франция");
        count.add("Англия");

        System.out.println("Список стран: " + count);

        count.set(1, "Бразилия");
        System.out.println("Замена: " + count);

        count.remove(2);
        System.out.println("Удаление: " + count);

        count.remove("Германия");
        System.out.println("Удалили по значению: " + count);

        int index = count.indexOf("Франция");
        System.out.println("Узнали индекс: " + index);

        boolean isHere = count.contains("Англия");
        System.out.println("Проверили в коллекции: " + isHere);
    }
}
