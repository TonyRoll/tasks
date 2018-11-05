package com.epam.task.task3;

public class Book extends Item {

    private String author;
    private String title;
    private String publisher;
    private int year;

    public Book(Long invNumber, boolean taken, String author, String title, String publisher, int year) {
        super(invNumber, taken);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void show() {
        System.out.println("Book{" + " invNumber='" + getInvNumber() + '\'' +
                ", taken='" + isAvailable() + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                "} ");
    }
}
