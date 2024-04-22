import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter ten double values: ");

        String[] strArray = in.nextLine().split(" ");

        double[] dArray = new double[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            dArray[i] = Double.parseDouble(strArray[i]);
        }
        

        double answer = average(dArray);

        System.out.println(answer);

        in.close();

    }
    
    public static int average(int[] array) {

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum / array.length;
    }
    
    public static double average(double[] array) {
        
        double sum = 0;
        for (double d : array) {
            sum += d;
        }

        return sum / array.length;
    }
}