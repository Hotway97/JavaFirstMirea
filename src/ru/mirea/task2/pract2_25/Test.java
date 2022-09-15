package ru.mirea.task2.pract2_25;

import java.util.Scanner;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantity;
        System.out.println("Cколько у вас собак?");
        quantity = scanner.nextInt();
        Vector<Dog> dogs = new Vector<>(0);
        String string = scanner.nextLine();

        System.out.println("Введите имя и возраст собаки:");
        for (int i = 0; i < quantity; i++) {
            System.out.print((i+1) + ")\t");
            string = scanner.nextLine();
            String[] strStrings = string.split(" ");
            String name = strStrings[0];
            int age = Integer.parseInt(strStrings[1]);
            dogs.addElement(new Dog(name, age));
        }

        System.out.println("\nИнформация о собаках \n");
        for (Dog i : dogs) {
            System.out.print(i.toString());
            System.out.println();
        }

    }
}
