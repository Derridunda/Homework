package Homework.Homework2.task2;
import java.util.Collections;
import java.util.List;

//Добавил final чтобы поля были неизменяемыми
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    //А в конструкторе я создам неизменяемый список
    ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = Collections.unmodifiableList(hobbies);
    }

    String getName() {
        return name;
    }
    // Метод ниже не будет работать, так как мы объявили final в String name
    // void setName(String name) {
    //     this.name = name;
    // }

    int getAge() {
        return age;
    }

    List<String> getHobbies() {
        return hobbies;
    }
}
