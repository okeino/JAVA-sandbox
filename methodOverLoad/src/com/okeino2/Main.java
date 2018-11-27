package com.okeino2;

public class Main {

    public static void main(String[] args) {

     double convertion = calcFeetAndInchesToCentimeters(7,5);

     if(convertion != -1) {
         System.out.println("Converted value is: " + convertion + "cm.");
     }
     else{
         System.out.println("Invalid arguments");
    }

        convertion= calcFeetAndInchesToCentimeters(-100);
        if(convertion != -1) {
            System.out.println("Inches to feet then cm is : " + convertion + "cm");
        }
        else{
            System.out.println("Invalid arguments");
        }


    }

    public  static  double calcFeetAndInchesToCentimeters( double feet, double inches){

        if((feet >= 0) && (inches >= 0 && inches <= 12 )){

            double allInches = (feet*12)+inches;
             return allInches * 2.54;

        }
        return -1;
    }

    public  static  double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0){

          double feet = (int) inches/12;
          inches = (int)inches % 12;

          return calcFeetAndInchesToCentimeters(feet, inches);


        }
        return -1;
    }
}
