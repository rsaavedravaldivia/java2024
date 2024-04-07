import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] vowels = {"a","e","i","o","u"};
        


        while (true) 
        {
            System.out.println("Enter a letter: ");
            String s = input.next();
            
            if (s.length() > 1) {
                System.out.println("Not a single character.");
                continue;
            }
            else if (Character.isDigit(s.charAt(0))) {
                System.out.println("That's a number.");
                continue;
            }
            else if (!Character.isLetter(s.charAt(0))) {
                System.out.println("Not a letter.");
                continue;
            }
            else if (Character.isLetter(s.charAt(0))) {
                System.out.println("that's a letter!");
                boolean isvowel = false;
                for (String vowel : vowels) {
                    if (s.toLowerCase().equals(vowel)) {
                        isvowel = true;
                    }

                }
                if (isvowel) {
                    System.out.println("It is a vowel.");
                    break;
                }
                else {
                    System.out.println("It is a consonant.");
                    break;
                }
                
                
            }
        }

    }
}