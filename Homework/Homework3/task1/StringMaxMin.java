package Homework.Homework3.task1;

import java.util.Scanner;

public class StringMaxMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();

        String lg = str1;
        String sh = str1;

        if (str2.length() > lg.length()) {
            lg = str2;
        }
        if (str3.length() > lg.length()) {
            lg = str3;
        }

        if (str2.length() < sh.length()) {
            sh = str2;
        }
        if (str3.length() < sh.length()) {
            sh = str3;
        }

        System.out.println("Самая длинная строка: " + lg);
        System.out.println("Её длинна: " + lg.length());
        System.out.println("Самая короткая строка: " + sh);
        System.out.println("Её длинна: " + sh.length());
    }
}
