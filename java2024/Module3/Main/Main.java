package Main;

import java.time.YearMonth;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                int year;
                int month;
                Scanner input = new Scanner(System.in);

                System.out.println("Enter a month of the year in number format, 0 to exit: ");
                month = input.nextInt();
                if (month == 0) {
                    break;
                }
                System.out.println("Enter a year in number format: ");
                year = input.nextInt();

                YearMonth yearMonth = YearMonth.of(year, month);
                int days = yearMonth.lengthOfMonth();

                System.out.println(yearMonth.getMonth() + " of the year " + yearMonth.getYear() + " had " + days + " days.");

            } catch (Exception e) {
                System.out.println("Error, please enter a valid input.");
                System.out.println(e);
            }

        }
    }

}
