

import java.util.Scanner;
import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Main {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        System.out.println("                                         ");

        String boldGreen = "\u001B[1;32m";                 //to change output printed colour
        System.out.println(boldGreen);                     //to change output printed colour


//        System.out.print("\u001B[43m");                    //to change output background colour

        System.out.println("                  GAME STARTS          ");
        System.out.println("                                       ");

        System.out.println("     🙏Welcome to ROCK , PAPER , SCISSOR GAME🙏");
        System.out.println("         👍 Best of Luck for The Game 👍  ");
        System.out.println("               📝Rules of the Game📝  ");

//        System.out.println("\u001B[45m");                 //to change output background colour

        System.out.println("                                         ");
        System.out.println("Press [0] for ROCK && [1] for PAPER && [2] for SCISSOR ");



        String boldRed = "\u001B[1;31m";                     //to change output printed colour
        System.out.println(boldRed);                         //to change output printed colour


        int userInput= sc.nextInt();
        Random random= new Random();
        int computerInput= random.nextInt(3);

        if (userInput==computerInput) {
            System.out.println("😁Match Draw😁");
        }
        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
            System.out.println("😎You Win😎");
        }
        else {
            System.out.println("😒Computer Wins😒");
        }

//        System.out.println("Computer Choice:="+computerInput);
if (computerInput==0) {
    System.out.println("Computer Choice:--> ROCK");
} else if (computerInput==1) {
    System.out.println("Computer Choice:-->PAPER");
} else {
            System.out.println("Computer Choice:-->SCISSOR");
        }
if (userInput<0 || userInput>2) {
    System.out.println("Invalid Number ! Please enter [0] [1] or [2]");
}
    }
}
