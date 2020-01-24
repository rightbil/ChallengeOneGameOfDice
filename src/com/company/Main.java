package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**Dice Game
Requirements :
         randomly select two numbers from 1-6 (like rolling two dice).
         Show the dice rolls and running score.
Rules:
         if dice face 1 and 1 score will be 25.
         if dice show 1 and non 1 score will be 0 for that role
         if dice show non 1 the sum will be added to the score
         When you reach a score of 100 (or more) the game ends.
         Prompt the user to either roll again or lose their turn.
Sample :
        Welcome! Let's Play Roll Dice!
        Your rolls 1 & 1
        Score: 25
        Roll again? yes
         */
        System.out.println("Welcome! Let's Play Roll Dice!");
        Scanner keyboard = new Scanner(System.in);
        Random rand1 = new Random();
        Random rand2 = new Random();
        // the game runs initially
        String rollAgain = "yes";
        // holds the runnning sum
        int score = 0;
         // the game will continue as far as player choose yes and the score is < 100
        while (rollAgain.equalsIgnoreCase("yes")  && score < 100 ) {
            // generate random number from 1 to 6
            int dice1 = 1 + rand1.nextInt(6);
            int dice2 = 1 + rand2.nextInt(6);
            // check if both dice are 1
            if (dice1 == 1 && dice2 == 1) {
                score += 25;
            }
            // check if both dice are not 1
            else if (dice1 != 1 && dice2 != 1){
                score += dice1 + dice2;
            }
            // handle when one of them is 1
            else
                score= score;
            System.out.println("Your rolls " + dice1 + " & " + dice2);
            System.out.println("Score: " + score);
            if(score <100) { // This is to not to show the user to roll again once the score reaches 100.
                System.out.println("Roll again?");
                rollAgain = keyboard.next();
            }
        }
        // message to the user if the game ends successfully
        if (score >= 100) {
            System.out.println("You have scored over 100");
            System.out.println("Thank you for playing!");
            System.out.println("");
        }
        // message to user if the game is aborted
        else {
            System.out.println("Thank you for playing!");
        }
    }
}
