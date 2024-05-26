package Homework.Homework3.task4;

import java.util.Scanner;

public class DoubleChar {

    private static String doubleChar(String str) {
        StringBuilder dbStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            dbStr.append(c).append(c);
        }
        return dbStr.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        System.out.println(doubleChar(str1));
        System.out.println(doubleChar(str2));
        System.out.println(doubleChar(str3));
    }
    
}

