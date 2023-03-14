import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println();
        file();
    }

    public static void file() {
        File myFile = new File("C://Users//USER//Desktop//java//File Class//text.txt");
        try {
            if (myFile.exists()){
                myFile.delete();
            System.out.println(myFile.createNewFile());
                System.out.println("File deleted and a new file created");
                }else
                System.out.println(myFile.createNewFile());
            System.out.println("New file created because file doesnt exist");

        }catch (IOException ex){
            System.out.println("File cannot be created");
        }
        System.out.println("MAIN PATH :"+myFile.getAbsoluteFile());



        try{
            PrintWriter writeTOFile=new PrintWriter(myFile);
           writeTOFile.print("Akosuah Aba");
            writeTOFile.println(" 79");

            writeTOFile.print("Prince Ofori");
            writeTOFile.println(" 756");

            writeTOFile.print("Ansah Oscar");
            writeTOFile.println(" 788");


       writeTOFile.close();
        }catch (FileNotFoundException ex){
            System.out.println("Cant find");
        }





        try{

            Scanner readFile= new Scanner(myFile);
            while (readFile.hasNext()){
                String firstName = readFile.next();
                String lastName = readFile.next();
                int marks=readFile.nextInt();
                System.out.println(firstName+" "+lastName+" "+marks);
            }

        }catch(FileNotFoundException ev){

        }
    }


}
