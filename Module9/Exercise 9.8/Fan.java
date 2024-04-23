
public class Fan {
    

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";


    public Fan() {
    }

    public String toString() {
        if (this.on) {

            String description = String.format("Speed: %s, Radius: %s, Color: %s", this.speed, this.radius,
                    this.color);
            return description;
        }
        
        else {
            return "fan is off.";
        }
    }

    
    public void SetSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void SetOn(boolean state) {
        this.on = state;
    }

    public void SetRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void SetColor(String newColor) {
        this.color = newColor;
    }

    public int GetSpeed() {
        return this.speed;
    }

    public boolean GetIsOn() {
        return this.on;
    }

    public double GetRadius() {
        return this.radius;
    }

    public String GetColor() {
        return this.color;
    }

 

}