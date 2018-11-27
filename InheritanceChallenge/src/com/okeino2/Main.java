package com.okeino2;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SportCar mycar = new SportCar("Tayota",2,"Red", "TX",
                "Right",2000,300,4,2,2,20);


        System.out.println("The make of the car is: "+ mycar.getMake());
        System.out.println("The car model is:"+mycar.getModel());
        System.out.println("The number of doors are:"+mycar.getDoors());
        System.out.println("The torque is: "+ mycar.getTorque());

        mycar.moving(200);
        mycar.drifting("left");

    }
}
