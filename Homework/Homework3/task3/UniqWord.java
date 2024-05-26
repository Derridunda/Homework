package Homework.Homework3.task3;

import java.util.HashSet;
import java.util.Scanner;

public class UniqWord {

    private static String findUniqueWord(String... strings) {
        for (String str : strings) {
            String[] words = str.split("\\s+");
            for (String wrd : words) {
                if (isUnique(wrd)) {
                    return wrd;
                }
            }
        }
        return null;
    }

    private static boolean isUnique(String word) {
        HashSet<Character> ch = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!ch.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scan.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scan.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scan.nextLine();

        String uniqWord = findUniqueWord(str1, str2, str3);
        if (uniqWord != null) {
            System.out.println("Первое уникальное слово: " + uniqWord);
        } else {
            System.out.println("Таких слов нет");
        }
    }    
}
