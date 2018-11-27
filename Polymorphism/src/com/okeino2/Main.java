package com.okeino2;


class  Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){

        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
     public Jaws(){
         super("Jaws");
     }

     public String plot(){
         return "A shark eats lots of people";
     }
}

class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attemp to take over plant earth";
    }
}

class IronMan extends Movie{

    public IronMan() {
        super("Iron Man");
    }

    //no plot..
}

class SupperMan extends Movie{

    public SupperMan() {
        super("Supper Man 2");
    }

    @Override
    public String plot() {
        return "Save the world...";
    }
}

class Up extends Movie{

    public Up() {
        super("Up the Movie");
    }

    @Override
    public String plot() {
        return "Cartoon about an old couple";
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<11; i++){

            Movie movie = randomMovie(); //eg: Movie movie = new Jaws
            System.out.println("Movie #"+ i +":"+ movie.getName()+"\n"+
            "Plot: "+movie.plot()+"\n");


        }


    }

    public static Movie randomMovie(){

        int randomNumber = (int) (Math.random() * 5)+1;
        System.out.println("Random number generated was:"+randomNumber);

        switch (randomNumber){

            case 1:
                return new Jaws();
            case 2:
                return  new IndependenceDay();
            case 3:
                return new IronMan();
            case 4:
                return  new SupperMan();
            case 5:
                return  new Up();
        }
      return null;
    }
}
