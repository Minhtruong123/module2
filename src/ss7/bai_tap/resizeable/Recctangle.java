package ss7.bai_tap.resizeable;

public class Recctangle extends Geometry implements Resizeable {
    private double width, height;

    public Recctangle(boolean filled, double width, double height) {
        super(filled);
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

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật sau khi tăng: " + (getArea() * percent / 100 + getArea()));
    }
}
