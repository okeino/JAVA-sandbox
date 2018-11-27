package com.okeino2;

/**
 * Created by okeinomcgowan on 18/04/2017.
 */
public class SportCar extends Car{

    private int torque;
    private  int headLights;
    private  int exhostPipe;
    private int doors;
    private int tyreSize;

    public SportCar(String make, int seats, String colour, String model, String driveSide, int weight, int torque, int headLights, int exhostPipe, int doors, int tyreSize) {
        super(make, 4, seats, "Gas", colour, model, "Sport", driveSide, weight);
        this.torque = torque;
        this.headLights = headLights;
        this.exhostPipe = exhostPipe;
        this.doors = doors;
        this.tyreSize = tyreSize;
    }

    public int getTorque() {
        return torque;
    }

    public int getHeadLights() {
        return headLights;
    }

    public int getExhostPipe() {
        return exhostPipe;
    }

    public int getDoors() {
        return doors;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void drifting(String side){

        System.out.println("Sport car is drifting!");
        super.carDirection(side);
    }

}
