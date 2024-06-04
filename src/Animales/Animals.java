package Animales;

import DataGeneral.ColorsData;
import DataGeneral.ColorsData;

public abstract class Animals {

    private String name = "";

    private int age = -1;

    private int weight = -1;

    private ColorsData color = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public ColorsData getColor() {
        return color;

    }

    public void setColor(ColorsData color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу: %d кг, мой цвет: %s",
        getName(), getAge(), getAgePadej(), getWeight(), getColor());
    }
public abstract void say();

    public void go() {
        System.out.println("Я иду");
    };
    public void drink() {
        System.out.println("Я пью");
    };
    public void eat(){
        System.out.println("Я ем");
    }



    @Override
    public String toString() {
        return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s", name, age, getAgePadej(), weight, color.getName().toLowerCase());
    }

    private String getAgePadej() {
        int ostatok = age % 10;

        if (age >= 11 && age <= 19) {
            return "лет";
        }
        if (ostatok == 1) {
            return "год";
        }
        if (ostatok >= 2 && ostatok <= 4) {
            return "года";
        }


        return "лет";

    }
}


