

public class Main {

    
    public static void main(String[] args) {

        long number = 234;
        System.out.println(sumDigits(number));


    }
    
    public static int sumDigits(long n) {

        // int processing

        String numString = Long.toString(n);
        System.out.println(numString);
        String[] numArray = numString.split("");
        
        int sum = 0;

        // iterate inside the num Array of strings
        for (String s : numArray) {
            int digit = Integer.parseInt(s);
            sum += digit;
        }

        return sum;
    }
}