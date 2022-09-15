package ru.mirea.task1.opt4;

import java.util.Scanner;

public class pract15 {
    public static void main(String[] args) {

        int n;
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        System.out.println("Факториал " + n + " это " + Factorial(n));
    }

    public static int Factorial(int n) {
        int result = 1;
        for(int i = n; i > 0; i--)
            result = result * i;
        return result;
    }
}