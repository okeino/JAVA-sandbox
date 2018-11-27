package com.okeino2;

public class Main {

    public static void main(String[] args) {

      String playerName = "Mark Black";
      int playerScore = 1500;
      int playerPosition = calculateHighScore(playerScore);
      displayHighScorePosition(playerName,playerPosition);


        playerName = "Sam Smith";
        playerScore = 900;
        playerPosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerName = "John Mark";
        playerScore = 400;
        playerPosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerName = "James Ray";
        playerScore = 50;
        playerPosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName,playerPosition);

    }

    public  static  int calculateHighScore(int score){

        if (score >= 1000)
            return 1;
        else if((score >= 500) && (score < 1000))
            return 2;
        else if((score >= 100) && (score < 500))
            return 3;
        else
            return 4;
    }

    public  static  void displayHighScorePosition(String name, int position){


        System.out.println(name + " managed to get into position "
                + position + " on the high score table.");
    }
}
