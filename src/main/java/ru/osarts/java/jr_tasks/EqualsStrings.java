package ru.osarts.java.jr_tasks;
// task0312

import java.util.Objects;
import java.util.Scanner;

public class EqualsStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        if (Objects.equals(str1, str2)) {
            System.out.println("строки одинаковые");
        } else
            System.out.println("строки разные");
    }
}
