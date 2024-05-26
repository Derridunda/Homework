package Homework.Homework4.task3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

        people.add(new Person("Андрей", 24));
        people.add(new Person("Никита", 25));
        people.add(new Person("Артём", 26));

        System.out.println("HashSet:");
        for (Person pers : people) {
            System.out.println(pers);
        }

        people.remove(new Person("Андрей", 24));
        people.remove(new Person("Никита", 25));

        System.out.println("Убрали 2 элемента:");
        for (Person pers : people) {
            System.out.println(pers);
        }

        Person lastPerson = new Person("Артём", 26);
        if (people.contains(lastPerson)) {
            System.out.println("Уже есть: " + lastPerson);
        } else {
            System.out.println("Такого объекта ещё нет");
        }
    }
}
