package com.okeino2;

/**
 * Created by okeinomcgowan on 18/04/2017.
 */
public class Vehicle {

    private String Make;
    private int wheels;
    private  int seats;
    private  int engine;
    private String petrolType;
    private String colour;

    public Vehicle(String make, int wheels, int seats, int engine, String petrolType, String colour) {
        Make = make;
        this.wheels = wheels;
        this.seats = seats;
        this.engine = engine;
        this.petrolType = petrolType;
        this.colour = colour;
    }

    public String getMake() {
        return Make;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getEngine() {
        return engine;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public String getColour() {
        return colour;
    }

    // my methods for this class

    public  void steering(String direction){
        System.out.println("The vehicle is steering, "+direction);
    }
    public  void changingGear (int grear){
        System.out.println("Vehicle now in gear: "+grear);
    }
    public  void moving(int speed){
        System.out.println("Vehicle moving at "+speed+"Mph. ");
    }

    public void stopped(){
        System.out.println("The vehicle stopped");
    }
}
