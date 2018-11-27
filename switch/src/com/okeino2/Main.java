package com.okeino2;

public class Main {

    public static void main(String[] args) {

        char letter = 'A';

        switch (letter){

            case 'A':
                System.out.println("The letter was A");
                break;
            case 'B':
                System.out.println("The letter was B");
                break;
            case 'C':
                System.out.println("The letter was C");
                break;
            case 'D':
                System.out.println("The letter was D");
                break;
            case 'E':
                System.out.println("The letter was E");
                break;
            default:
                System.out.println("Letter was not A, B, C, D or E /not found");
                break;
        }

        String month = "JuNe";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
                default:
                    System.out.println("Not sure");
                    break;
        }
    }
}
