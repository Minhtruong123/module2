package ss4.baitap;

public class FanDesign {
    static final int slow=1;
    static final int medium=2;
    static final int fast=3;
    private int speed=1;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on=on;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        if (this.getOn()){
            return "Speed: " + getSpeed() + ", color: "+ getColor()+ ", radius: "+ getRadius()+", fan is on";
        }
        else {
            return "Speed: " + getSpeed() + ", color: "+ getColor()+ ", radius: "+ getRadius()+", fan is off";
        }
    }

    public static void main(String[] args) {
        FanDesign fan1 = new FanDesign();
        fan1.setSpeed(fast);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.toString());

        FanDesign fan2 = new FanDesign();
        fan2.setSpeed(medium);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
