package ru.mirea.task2.pract21;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNewShape(String name) {
        this.name = name;
    }

    public String toString() {
        return "Эта фигура есть " + getName();
    }
}
