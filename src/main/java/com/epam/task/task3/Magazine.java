package com.epam.task.task3;

public class Magazine extends Item {

    private int volume;
    private int number;
    private int year;
    private String title;

    public Magazine(Long invNumber, boolean taken, int volume, int number, int year, String title) {
        super(invNumber, taken);
        this.volume = volume;
        this.number = number;
        this.year = year;
        this.title = title;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        System.out.println("Magazine{" + " invNumber='" + getInvNumber() + '\'' +
                ", taken='" + isAvailable() + '\'' +
                ", volume=" + volume +
                ", number=" + number +
                ", year=" + year +
                ", title='" + title + '\'' +
                "} ");
    }
}
