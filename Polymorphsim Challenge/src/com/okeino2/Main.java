package com.okeino2;

class Car{
    private String name;
    private boolean engine;
    private  int cylinders;
    private int wheels;
    private  int doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 4;
    }

    public String startEngine(){
        return "Base class ->Engine Started!";
    }
    public String  accelerate(){
        return "Base class ->Car accelerating!";
    }
    public String brake(){
        return "Base class ->Car braked!";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}

class Toyota extends Car{

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota Started...!";
    }

    @Override
    public String accelerate() {
        return "Toyota accelerating!";
    }

    //no brake here
}

class Lexus extends Car{

    public Lexus(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Lexus Started...!";
    }

    @Override
    public String accelerate() {
        return "Lexus accelerating!";
    }

    @Override
    public String brake() {
        return "Lexus stopped!";
    }
}

class Nissan extends Car{

    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    // no engine start here

    @Override
    public String accelerate() {
        return "Blue Bird accelerating!";
    }

    //no brake here
}

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<10; i++) {


            Car mycar = randomCar();

            System.out.println("Car #"+i+":"+mycar.getName()+"\n"+
            "Number of cylinder: "+mycar.getCylinders()+"\n"+
            "Start: "+mycar.startEngine()+"\n"+
            "Accelerate: "+mycar.accelerate()+"\n"+
            "Brake: "+mycar.brake()+"\n");
        }




    }

    public static Car randomCar(){

        int randomNumber = (int) (Math.random() * 3)+1;
        System.out.println("Random number was: "+randomNumber);


        switch (randomNumber){

            case 1:
                return new Toyota("Toyota Axio",4);
            case  2:
                return new Lexus("Lexus xl",6);
            case 3:
                return new Nissan("Blue Bird",4);

        }
        return  null;
    }
}
