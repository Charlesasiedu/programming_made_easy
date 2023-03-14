


import java.io.*;
import java.util.*;


public class InputOutputAssignment {
    static Date current=new Date();
    public static void main(String[] args) {
        System.out.println();
        file();
    }

    public static void file() {
        File myFiles = new File("C://Users//USER//Desktop//java//File Class//CE2ClassDetail.txt");
        try {
            if (myFiles.exists()){
                myFiles.delete();
                System.out.println(myFiles.createNewFile());
                System.out.println("File deleted and a new file created");
            }else
                System.out.println(myFiles.createNewFile());
            System.out.println("New file created because file doesnt exist");

        }catch (IOException ex){
            System.out.println("File cannot be created");
        }
        System.out.println("MAIN PATH :"+myFiles.getAbsoluteFile());



        try{
            PrintWriter writeTOFile=new PrintWriter(myFiles);
            System.out.println("DATE UPDATED :"+current);
            System.out.println();
            writeTOFile.print("FIRST_NAME        LASTNAME ");
            writeTOFile.println("     PHONE_NUMBER");

            System.out.println();
            writeTOFile.print("Abubakar          Abubakar");
            writeTOFile.println("      0554069876");

           System.out.println();
            writeTOFile.print("Konstantine       Addae");
            writeTOFile.println("         0243903344");

            writeTOFile.print("Stephen           Owusu");
            writeTOFile.println("         0544212647");

            writeTOFile.print("Nana              Okyere");
            writeTOFile.println("        0504864048");

            System.out.println();
            writeTOFile.print("Charles           Asiedu");
            writeTOFile.println("        0545409069");

            System.out.println();
            writeTOFile.print("Jude              Seidu");
            writeTOFile.println("         0545267382");

            System.out.println();
            writeTOFile.print("Jeffery           Essien");
            writeTOFile.println("        0559083583");

            System.out.println();
            writeTOFile.print("Sherif            Quantson");
            writeTOFile.println("      0246993562");

            System.out.println();
            writeTOFile.print("Daniel            Quaw");
            writeTOFile.println("          0552665126");

            System.out.println();
            writeTOFile.print("George            Acquah");
            writeTOFile.println("        0551363571");

            System.out.println();
            writeTOFile.print("Mark              Spencer");
            writeTOFile.println("       0549565967");

            System.out.println();
            writeTOFile.print("Angela            Apiaah");
            writeTOFile.println("        0593595659");

            System.out.println();
            writeTOFile.print("Seth              Arthur");
            writeTOFile.println("        0555610172");

            System.out.println();
            writeTOFile.print("Yaa               Elikplim");
            writeTOFile.println("      0506646709");

            System.out.println();
            writeTOFile.print("Selby             Edorh");
            writeTOFile.println("         0554026407");

            System.out.println();
            writeTOFile.print("Esther            Amoo");
            writeTOFile.println("          0544446566");

            System.out.println();
            writeTOFile.print("Sandra            Sarpong");
            writeTOFile.println("       0246759914");

            System.out.println();
            writeTOFile.print("Samuel            Addae");
            writeTOFile.println("         0246759914");

            System.out.println();
            writeTOFile.print("Paul-Kwesi        Appiah");
            writeTOFile.println("        0545555656");


            System.out.println();
            writeTOFile.print("Stephen           Asiamah");
            writeTOFile.println("       0245555659");

            System.out.println();
            writeTOFile.print("Ishaq-Afiba       Maimuna");
            writeTOFile.println("       0246759914");

            System.out.println();
            writeTOFile.print("Festus            Amponsah");
            writeTOFile.println("      0540226686");

            System.out.println();
            writeTOFile.print("Louis             Kyeremeh");
            writeTOFile.println("      0553790766");

            System.out.println();
            writeTOFile.print("Richmond          Gbekley");
            writeTOFile.println("       0550229150");

            System.out.println();
            writeTOFile.print("Philimon          Atuahene");
            writeTOFile.println("      0550671793");

            System.out.println();
            writeTOFile.print("Julius            Anumbia");
            writeTOFile.println("       0240818849");

            System.out.println();
            writeTOFile.print("Kingsley          Gyan");
            writeTOFile.println("          0553155081");

            System.out.println();
            writeTOFile.print("Bennett           Awortwe");
            writeTOFile.println("       0244565656");

            System.out.println();
            writeTOFile.print("Philip            Baidoo");
            writeTOFile.println("        0575225380");

            System.out.println();
            writeTOFile.print("Thompson          Emmanuel");
            writeTOFile.println("      0543740302");

            System.out.println();
            writeTOFile.print("Saviour           Frimpong");
            writeTOFile.println("      0545535908");

            System.out.println();
            writeTOFile.print("Awaals            Ilham");
            writeTOFile.println("         0559754155");

            System.out.println();
            writeTOFile.print("Kelvin            Sedem");
            writeTOFile.println("         0559754155");

            System.out.println();
            writeTOFile.print("Aaron             Ofofi");
            writeTOFile.println("         0255306062");

            System.out.println();
            writeTOFile.print("Richard           Ofofi");
            writeTOFile.println("         0543306062");

            System.out.println();
            writeTOFile.print("Kweku             Amandine");
            writeTOFile.println("      0500008665");

            System.out.println();
            writeTOFile.print("Haruna            Mohammed");
            writeTOFile.println("      0255306062");



                    writeTOFile.close();
        }catch (FileNotFoundException ex){
            System.out.println("Cant find");
        }
        try{

            Scanner readFile= new Scanner(myFiles);
            while (readFile.hasNext()){
                String firstName = readFile.next();
                String lastName = readFile.next();
                String phoneNumber = readFile.next();
                System.out.println(firstName+" "+lastName+" "+" "+phoneNumber);
            }

        }catch(FileNotFoundException ev){

        }
    }



}
