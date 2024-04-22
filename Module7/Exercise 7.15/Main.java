
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");

        // get the numbers in a string array separated by spaces
        String[] strList = in.nextLine().split(" ");
        // initialize int array with lenght of the string array
        int[] intList = new int[strList.length];
        // transform the string array into an int array
        // since the array is initialized with the size of the input string it can
        // hold any size
        for (int i = 0; i < strList.length; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

    
        // call elimitareDuplicates and printing in correct format
        int[] distinctList = eliminateDuplicates(intList);
        for (int i : distinctList) {
            System.out.print(i + " ");
        }

        in.close();

    }

    public static int[] eliminateDuplicates(int[] list) {

        // since the parameter inputs a int array I transformed it into a arraylist
        // that has more functionality and since I don't know the size of the final array.
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int number : list) {
            // adding numbers to the arraylist that are not already contained.
            if (!arrayList.contains(number)) {
                arrayList.add(number);
            }
        }
        // go back to an int array with size of the arrayList length.
        int[] distinct = new int[arrayList.size()];
        for (int index = 0; index < arrayList.size(); index++) {
            distinct[index] = arrayList.get(index);
        }

        // return the int[] array
        return distinct;
    }
}