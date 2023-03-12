import java.util.Arrays;

public class ArrayAssignment {

        public static void main(String[] args) {
            int [] myLists = new int[20];
            for (int i=0;i<= myLists.length-1;i++) {
                myLists[i]=(int) (Math.random()*50);
            }
            mainArrayFunction(myLists);
        }

        // A function which displays arrays based on the array argument passed to it
        public static void displayArray(int[] myLists){
            System.out.print("[" );
            for (int i = 0; i <= myLists.length-1; i++){
                System.out.print(" " + myLists[i]);
            }
            System.out.print(" ]" );
        }

        public static void mainArrayFunction(int[] myLists){
            System.out.println("20  random numbers");
            displayArray(myLists);
            System.out.println();
            int smallest = findSmallest(myLists);
            System.out.println("\nThe smallest number in the array is :: " + smallest);
            int index = indexOfSmallest(myLists);
            System.out.println("The index of " + smallest + " is :: " + index);
            System.out.println();
            System.out.println("The array sorted in ascending order:: ");
            int [] sortedLists = reorder(myLists);
            displayArray(sortedLists);
            System.out.println();
            //display the average
            System.out.println();
            System.out.print("The average of the number in the array is :: ");
            int average = averageOfArray(myLists);
            System.out.println(average);
            System.out.println();
            // Display the elements greater than the average
            greaterThanAverage(myLists , average);
            System.out.println();
            // Displays the elements of the array that are prime
            System.out.println();
            System.out.println("numbers of the array that are prime:: ");
            primeNumbers(myLists);
            // Display the first twenty prime numbers
            System.out.println("The first twenty prime numbers in ana array format :: ");
            System.out.println();
            firstTwentyPrimeNumbers();

        }

        public static int findSmallest(int[] myLists){
            int smallest = myLists[0];
            for (int i = 0; i < myLists.length; i++){
                if(myLists[i] < smallest ){
                    smallest = myLists[i];
                }
            }
            return smallest;
        }

        //FInd the index of the smallest number of an array
        public static int indexOfSmallest(int[] myLists){
            int index = 0;
            int smallest = myLists[0];
            for (int i = 1; i < myLists.length; i++){
                if (myLists[i] <= smallest){
                    smallest = myLists[i];
                    index = i;
                }
            }
            return index;
        }

        // Sort the array to be sorted
        public static int [] reorder(int [] myLists)
        {
            int[] Lists = myLists;
            for (int i = 0; i < Lists.length; i++) {
                int maxnum=0;
                for (int j = i+1; j < Lists.length ; j++) {
                    if (Lists[j]<Lists[i]){
                        maxnum=Lists[i];
                        Lists[i]=Lists[j];
                        Lists[j]=maxnum;
                    }
                }
            }
            return Lists;
        }

        public static int averageOfArray (int[] myLists ) {
            int average;
            int sum = 0;
            for (int i = 0; i< myLists.length; i++){
                sum = sum + myLists[i];
            }
            average = sum / myLists.length;
            return average;
        }

        public static void greaterThanAverage(int[] myLists , int average){
            System.out.println("Elements of the array that are greater than the average value " + average + " are::");
            System.out.print("[" );
            for(int i = 0; i<myLists.length; i++) {
                if(average<=myLists[i]) {
                    System.out.print(" " + myLists[i]);
//                        System.out.println("Index ::"+i+" Element::"+myLists[i]);
                }
            }
            System.out.print(" ]" );
        }

        public static void primeNumbers(int [] myLists){
            int n=0,i=0,j=0;
            boolean flag=true;
            System.out.print("[ " );
            for(i=0;i < myLists.length;i++)
            {
                flag=true;
                if(myLists[i]>1)
                {
                    for(j=2;j< myLists[i];j++)
                    {
                        /*Checking if number is divisible by j.*/
                        if(myLists[i] % j == 0)
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        System.out.print(myLists[i]+" ");
                    }
                }
            }
            System.out.print(" ]" );
        }

        public static void firstTwentyPrimeNumbers(){
            int counter=0,n=0,i=1,j=1;
            System.out.print("[" );
            while(n<20)
            {
                j=1;
                counter=0;
                while(j<=i)
                {
                    if(i%j==0)
                        counter++;
                    j++;
                }
                if(counter==2)
                {
                    System.out.print(" "+ i);
                    n++;
                }
                i++;
            }
            System.out.print(" ]" );
        }
    }

