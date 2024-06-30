package ru.osarts.java.jr_tasks;
// task0314;

import java.util.Scanner;

// Сломанная клавиатура

public class BrokenKeyboard {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();

        if (str1.toLowerCase() != secret.toLowerCase()) {
            System.out.println("Ваш вариант: " + str1.toLowerCase());
            System.out.println("А код был - " + secret.toLowerCase());
            System.out.println("доступ запрещен");
        } else {
            System.out.println("доступ разрешен");
        }

    }
}