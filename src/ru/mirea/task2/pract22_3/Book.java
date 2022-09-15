package ru.mirea.task2.pract22_3;

public class Book {
    private String name;
    private String genre;
    private String author;

    public Book(String name, String genre, String author) {
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Эта книга\"" + getName() + "\" Автор " + getName() + ", написана в " + getGenre() + " жанре";
    }
}