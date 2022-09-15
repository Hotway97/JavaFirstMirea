package ru.mirea.task2.pract22_3;

public class Ball {
    private String name;
    private String size;

    public Ball(String name, String size)
    {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "This is a " + getName() + " ball";
    }
}
