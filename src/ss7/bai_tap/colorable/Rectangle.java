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
    public String howToColor() {
        if (super.isFilled()) {
            return "Color " + super.getColor() + " all four sides";
        } else {
            return "No color";
        }
    }

    @Override
    public String toString() {
        return "Area of this rectangle is: " + this.getArea() + "."+this.howToColor();
    }
}
