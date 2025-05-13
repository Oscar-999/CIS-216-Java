package edu.jjc.week12.lab12;

public class Animal {
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name){
        this.name = name;
    }
}
