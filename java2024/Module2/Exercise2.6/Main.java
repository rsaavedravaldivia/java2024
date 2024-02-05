import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter subtotal and gratuity rate separated by a space: ");

            String[] values = scanner.nextLine().split(" ");

            double gratuity = (Double.parseDouble(values[1]) / 100.) * Double.parseDouble(values[0]);
            double total = gratuity + Double.parseDouble(values[0]);

            
            System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
