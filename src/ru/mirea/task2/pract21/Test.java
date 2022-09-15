package ru.mirea.task2.pract21;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("круг");
        System.out.println(shape.toString());

        shape.setNewShape("Пирамида");
        System.out.println(shape.toString());

        if (shape.getName() == "Пирамида")
            System.out.println("Все работает!");
        else System.out.println("Что-то пошло не так");
    }
}
