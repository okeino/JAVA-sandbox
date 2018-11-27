package com.okeino2;

/**
 * Created by okeinomcgowan on 18/04/2017.
 */
public class Car extends Vehicle{

    private String model;
    private String shape;
    private String driveSide;
    private int weight;

    public Car(String make, int wheels, int seats, String petrolType, String colour, String model, String shape, String driveSide, int weight) {
        super(make, wheels, seats,1, petrolType, colour);
        this.model = model;
        this.shape = shape;
        this.driveSide = driveSide;
        this.weight = weight;
    }


    public String getModel() {
        return model;
    }

    public String getShape() {
        return shape;
    }

    public String getDriveSide() {
        return driveSide;
    }

    public int getWeight() {
        return weight;
    }

    public  void drive(int speed){
        super.moving(speed);
    }

    @Override
    public  void stopped(){
        System.out.println("The car stopped");
        super.stopped();
    }

    public void carDirection(String direction){

        System.out.println("The car is heading:");
        super.steering(direction);


    }

}
