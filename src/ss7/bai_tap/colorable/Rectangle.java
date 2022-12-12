package ss7.bai_tap.colorable;

public class Rectangle extends Geometry implements ColorableInterface {
    private double width, height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void howToColor() {
        if (super.isFilled()) {
            System.out.println("Color " + super.getColor() + " all four sides");
        } else {
            System.out.println("No color");
        }
    }

    @Override
    public String toString() {
        return "Area of this rectangle is: " + this.getArea();
    }
}
