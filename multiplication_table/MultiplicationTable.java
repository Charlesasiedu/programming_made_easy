import java.util.Scanner;
import java.util.Date;
import java.util.Objects;

public class MultiplicationTable {
    static int number;
    static String underline , answer;
    static Date current = new Date();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n TODAY : "+current+ "\n");
        System.out.println("WELCOME TO THE DYNAMIC MULTIPLICATION CALCULATOR");
        System.out.println("------------------------------------------------ ");
        System.out.println("This System Accepts Numbers from 1 to 30 \n");
        multiplicationDisplay();
    }
    public static void maxMultiplicand(){
        System.out.println("Please enter your maximum multiplicand: ");
        number = input.nextInt();
        System.out.println();
    }
    public static void body(){
        System.out.print("\t");
        int i =1, x =1, y=1 ,z=1;
        while (i <= number){
            System.out.print( i + "\t");
            i++;
        }
        System.out.println( );
        while(z <=number){
            underline = "-----";
            System.out.print("" +underline );
            z++;
        }
        System.out.println();
        while (x <= number){
            System.out.print(x + "|");
            while (y <= number){
                System.out.print("\t" + x*y);
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
    }
    public static void largeIntegers() {
        if (number <=30){
            body();
        }
else {
            System.out.println("SORRY... UNABLE TO DISPLAY");
            System.out.println("Enter number less than 31");
        }
    }
    public static void multiplicationDisplay(){
        do {
            maxMultiplicand();
            largeIntegers();
            System.out.println();
            System.out.print("Do you want to continue?");
            answer = input.next();
            System.out.println();
        }
        while (Objects.equals(answer, "Yes" )|| Objects.equals(answer, "yes")
|| Objects.equals(answer, "Y") || Objects.equals(answer, "y"));
        System.out.println("THANK YOU FOR USING THIS SOFTWARE ");
    }
}
