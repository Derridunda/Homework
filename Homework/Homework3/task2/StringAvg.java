package Homework.Homework3.task2;

import java.util.Scanner;

public class StringAvg {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();

        double avgStr = (str1.length() + str2.length() + str3.length()) / 3;
        System.out.println("Средняя длина строки: " + avgStr);

        System.out.println("Вывод строк с длинной меньше средней");
        if (str1.length() < avgStr) {
            System.out.println(str1);
            System.out.println("Длинна строки: " + str1.length());
        }
        else if (str2.length() < avgStr) {
            System.out.println(str2);
            System.out.println("Длинна строки: " + str2.length());
        }
        else if (str3.length() < avgStr) {
            System.out.println(str3);
            System.out.println("Длинна строки: " + str3.length());
        }
    }
}