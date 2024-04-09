
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        // this can be improved adding a try catch block
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double num1 = input.nextDouble();
        System.out.println("Please enter a number: ");
        double num2 = input.nextDouble();
        System.out.println("Please enter a number: ");
        double num3 = input.nextDouble();
        
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] numArr = { num1, num2, num3 };
        Arrays.sort(numArr);
        for (double d : numArr) {
            System.out.println(d);
        }
    }
}