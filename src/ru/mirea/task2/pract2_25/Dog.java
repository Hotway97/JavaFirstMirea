package ru.mirea.task2.pract2_25;

public class Dog {
    private String Name;
    private int Age;

    public Dog(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int toHuman() {
        return getAge()*7;
    }

    public String toString() {
        return "Это" + getName() + ". Ему " + getAge() + " лет. В человеческих годах " + toHuman();
    }
}
