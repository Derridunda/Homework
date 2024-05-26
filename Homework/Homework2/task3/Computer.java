package Homework.Homework2.task3;

public class Computer {
    public static class Proccessor {
        private static String model;

        Proccessor(String model) {
            Proccessor.model = model;
        }

        static String getDetails() {
            return model;
        }
    }

    public class RAM {
        private int size;

        RAM(int size) {
            this.size = size;
        }

        int getDetails() {
            return size;
        }
    }

    void testComputer() {
        Proccessor proc = new Proccessor("Intel core i7");
        RAM ram = new RAM(16);
        System.out.println("В компе стоит " + Proccessor.getDetails() + " c " + ram.getDetails() + "gb оперативки");
    }

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.testComputer();
    }
}


