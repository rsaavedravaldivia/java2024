import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter celsius number: ");

            double celsius = scanner.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32;

            System.out.println(celsius + " celsius is " + fahrenheit + " farhrenheit.");
        }  catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        
    }
}