

public class Main {
    
    public static void main(String[] args) {
        
        
        double rate = 1.05;

        double cost = 10000;

        double fourYearsAfterTenth = 0;

        for (int i = 1; i < 15; i++) {
            cost *= rate;
        
            if (i == 10) {
                System.out.println("Tuition at tenth year: " + cost);
            }
            if (i > 10) {
                fourYearsAfterTenth += cost;
            }
        }
            
            System.out.println("Four years of tuition after tenth year: "+fourYearsAfterTenth);

    }


}