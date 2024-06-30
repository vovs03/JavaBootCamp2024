package ru.osarts.java.jr_tasks;
// task0311

import java.util.Scanner;

public class HighAccuracy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        if (Math.abs(num1 - num2) <= 0.000_001) {
            System.out.println("Числа равны");
        } else
            System.out.println("Числа не равны");
    }
}
