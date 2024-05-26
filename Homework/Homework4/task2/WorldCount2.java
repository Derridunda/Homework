package Homework.Homework4.task2;

import java.util.LinkedList;

public class WorldCount2 {

    public static void main(String[] args) {
        LinkedList<String> count = new LinkedList<>();
        count.add("Россия");
        count.add("США");
        count.add("Китай");

        count.addFirst("Франция");
        count.addFirst("Германия");
        count.addLast("Англия");
        count.addLast("Бразилия");

        System.out.println("Добавили страны: " + count);

        count.removeFirst();
        count.removeLast();

        System.out.println("Удалили: " + count);

        String frst = count.getFirst();
        String last = count.getLast();

        System.out.println("Первая страна: " + frst);
        System.out.println("Последняя страна: " + last);
    }
}

