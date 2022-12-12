package ss7.bai_tap.colorable;

public class Square extends Geometry implements ColorableInterface {
    private double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Area of this square: " + this.getArea();
    }

    @Override
    public void howToColor() {
        if (super.isFilled()) {
            System.out.println("Color " + super.getColor() + " all four sides");
        } else {
            System.out.println("No color");
        }
    }
}
