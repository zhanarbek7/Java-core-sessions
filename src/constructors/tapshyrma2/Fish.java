package com.company2;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 9/8/22
 */
public class Fish {
    private String name;
    private int age;
    private String color;
    private double weight;
    private boolean pet;

    public Fish(String name, int age, String color, double weight, boolean pet) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isPet() {
        return pet;
    }
}
