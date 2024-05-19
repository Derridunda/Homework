package Homework.task2.two;
import java.util.List;

//А в этом классе final и неизменяемого списка не будет
public class MutablePerson {
    private  String name;
    private  int age;
    private  List<String> hobbies;

    MutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    List<String> getHobbies() {
        return hobbies;
    }
}
