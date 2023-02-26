import java.util.*;

public class Main {

    static ArrayList<String> items = new ArrayList<>();
    static  Scanner input = new Scanner(System.in);
    static String item;

    public static void doPop()
    {
        char choice;
        do {
            System.out.println("Do you want to perform a POP operation ? (y/n):");
            choice = input.next().charAt(0);

            if (choice == 'y')
            {
                if (!items.isEmpty())
                {
                    items.remove(items.size() - 1);
                    System.out.println("POP OPERATION\n----------------\nThe last item was removed.\nThe remaining items are :");
                    for (int i = items.size() - 1; i >= 0; i--)
                    {
                        System.out.println("->" + items.get(i));
                    }
                }
                else{
                    System.out.println("No item to remove.");
                }
            }
        }while (choice == 'y' && !items.isEmpty());

    }

    public static void pushTOStack()
    {
        int num;

        System.out.println("Enter the quantity of items you want to push :");
        num = input.nextInt();

        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter item #" + (i+1) + ":");
            item = input.next();
            items.add(item);
        }
        System.out.println("\nPUSH OPERATION\n--------------\nYou PUSHED the following items to the stack: ");
        for (int i = items.size()-1; i >= 0; i--)
        {
            System.out.println(" - > " + items.get(i));
        }
    }


    public static void main(String[] args) {
        pushTOStack();
        doPop();
    }

}
