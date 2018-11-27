package com.okeino2;

/**
 * Created by okeinomcgowan on 17/04/2017.
 */
public class Animal {

    private String name;
    private int brain;
    private  int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal class eat called!");

    }

    public void move(int speed)
    {
        System.out.println("Animal moves at spped: "+speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
