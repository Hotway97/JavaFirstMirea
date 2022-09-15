package ru.mirea.task1.opt4;
import java.util.Arrays;
import java.util.Random;
public class pract14 {
    public static void main(String[] args) {

        int[] next = new int[7];
        int[] matth = new int[7];
        Random ran = new Random();

        System.out.println("Random generated:");
        for (int i = 0; i < 7; i++) {
            next[i] = ran.nextInt();
            System.out.println(next[i]);
        }
        Arrays.sort(next);
        System.out.println("\nSorted:");
        for (int i = 0; i < 7; i++) System.out.println(next[i]);

        System.out.println("\nRandom Math:");
        for (int i = 0; i < 7; i++) {
            matth[i] = (int) (Math.random() * 10000);
            System.out.println(matth[i]);
        }

        Arrays.sort(matth);
        System.out.println("\nSorted:");
        for (int i = 0; i < 7; i++) System.out.println(matth[i]);
    }
}