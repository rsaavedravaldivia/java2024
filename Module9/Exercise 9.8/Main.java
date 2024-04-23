


public class Main {
    
    public static void main(String[] args) {
    

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.SetSpeed(3);
        fan1.SetRadius(10);
        fan1.SetColor("yellow");
        fan1.SetOn(true);

        fan2.SetSpeed(2);
        fan2.SetRadius(5);
        fan2.SetColor("blue");
        fan2.SetOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

}

}