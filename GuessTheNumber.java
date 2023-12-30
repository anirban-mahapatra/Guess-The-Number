/*
CREATE A CLASS GAME, WHICH ALLOWS A USER TO PLAY "GUESS THE NUMBER" GAME ONCE.

GAME SHOULD HAVE THE FOLLOWING METHODS:
CONSTRUCTOR TO GENERATE THE RANDOM NUMBER
takeUserInput() TO TAKE A USER INPUT OF NUMBER
isCorrectNumber() TO DETECT WHETHER THE NUMBER ENTERED BY THE USER IS TRUE
GETTER AND SETTER FOR noOfGuesses
USE PROPERTIES SUCH AS noOfGuesses(INT), ETC TO GET THIS TASK DONE!
 */

import java.util.*;

class Game{
    int rannum,num;
    int noOfGuesses;

    Game(){
        Random r=new Random();
        rannum=r.nextInt(100);
    }

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(rannum==num){
            return true;
        }
        else if(rannum<num) {
            System.out.println("Too High.....");
        }
        else if(rannum>num){
            System.out.println("Too Low.....");
        }
        return false;
    }

    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
}

public class GuessTheNumber{
    public static void main(String[] args){
        Game g=new Game();
        boolean t=false;
        g.setnoOfGuesses(0);
        while(!t) {
            System.out.print("Enter your guesses: ");
            g.takeUserInput();
            t=g.isCorrectNumber();
        }
        System.out.println("\n\nRIGHT GUESSES\nNo of guesses = "+g.getnoOfGuesses());
    }
}
