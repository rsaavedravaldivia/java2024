package Exercise3_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_FROM_POUND = 0.45359237;
        final double METER_FROM_INCH = 0.0254;

        try {
            System.out.println("Please enter weigth in pounds: ");
            double weigth = input.nextDouble();

            System.out.println("Please enter height in feet: ");
            double feet = input.nextDouble();

            System.out.println("Please enter height in inches: ");
            double inches = input.nextDouble();

            double weigthInKilogram = weigth * KILOGRAMS_FROM_POUND;
            double totalInches = feet * 12 + inches;
            double heightInMeter = totalInches * METER_FROM_INCH;

            double bmi = (weigthInKilogram) / (heightInMeter * heightInMeter);

            System.out.println("Your BMI is: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obsese");
            }

        } catch (Exception e) {
            System.out.println("Error, please try again.");
            System.out.println(e);
        }

    }

}
