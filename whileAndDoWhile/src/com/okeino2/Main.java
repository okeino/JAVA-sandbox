package com.okeino2;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber){

            if(!isEvenNumber(number))
            {
                number++;
                continue;
            }

            System.out.println("Even number "+ number);
            number++;
            count++;

            if(count>=5)
            {
                break;
            }
        }
        System.out.println("The total number of even numbers are: "+ count);


    }

    public  static boolean isEvenNumber(int number)
    {

        if((number % 2)==0)
        {
            return  true;
        }
        else
            return  false;


    }
}
