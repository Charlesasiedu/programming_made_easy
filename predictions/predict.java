import java.util.Date;
import java.util.Scanner;

public class Prediction {
    public static void main (String[]args){
        execute();
    }
    public static void execute() {
        System.out.println();
        Date now = new Date();

        System.out.println("Date : " + now);

        System.out.println("     WELCOME TO THE PREDICTION SYSTEM");
        System.out.println("     --------------------------------\n");

        Scanner insert = new Scanner(System.in);
        System.out.println("What is your Name ? ");
        String name = insert.nextLine();
        System.out.println("       RANGE SYSTEM ");

        System.out.print(name + " Enter your minimum number :");
        int min = insert.nextInt();
        System.out.print(name + " Enter your maximum number :");
        int max = insert.nextInt();

        System.out.println("\n"+name + " the minimun:" + min + " and the maximum:" + max + " you have entered are exclusive");
        System.out.print("predict a number : ");
        int predict = insert.nextInt();
        System.out.println();

        int myRandom;
        do {
            myRandom = (int) (Math.random() * (min - max + 1) + max);
            System.out.println("THE SYSTEM PREDICTED " + myRandom);

            if (myRandom == predict) {
                System.out.println("CONGRATULATION !!!!!! YOU'VE WON");
            } else {
                System.out.println();
                System.out.println(" SORRY! YOU LOST");

                     System.out.println("Predict a different number :");
                     predict = insert.nextInt();

                System.out.println();
            }
        }
        while (myRandom != predict);
    }
    }