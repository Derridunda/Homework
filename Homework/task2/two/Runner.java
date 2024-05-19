package Homework.task2.two;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>(Arrays.asList("Гулять", "Рисовать", "Сидеть на дваче"));

        ImmutablePerson pers1 = new ImmutablePerson("Aндрей", 24, hobbies);
        System.out.println("Возраст: " + pers1.getAge());
        System.out.println("Имя: " + pers1.getName());
        System.out.println("Хобби: " + pers1.getHobbies());
        //Вызов метода не получится
        //pers1.setName("Кто-то другой");

        //С помощью try catch проверим изменяемость hobbies
        try {
            pers1.getHobbies().add("Делать домашку вовремя");
        } catch(UnsupportedOperationException o) {
           System.out.println("Да, это действительно невозможно");
        }
        System.out.println("На всякий случай проверим ещё раз hobbies: " + pers1.getHobbies());

        MutablePerson pers2 = new MutablePerson("Вася", 26, hobbies);
        System.out.println("Возраст: " + pers2.getAge());
        System.out.println("Имя: " + pers2.getName());
        System.out.println("Хобби: " + pers2.getHobbies());

        //А этот в этом объекте нам доступны изменения
        pers2.setAge(25);
        pers2.setName("Никита");
        pers2.getHobbies().add("Делать домашку вовремя");

        System.out.println("Возраст: " + pers2.getAge());
        System.out.println("Имя: " + pers2.getName());
        System.out.println("Хобби: " + pers2.getHobbies());


    }
}