package ss6.circle_clynder;

public class Clynder extends Circle {
    private int height;

    public Clynder(int height) {
        this.height = height;
    }

    public Clynder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volumn() {
        return this.height * this.getArea();
    }

    @Override
    public String toString() {
        return "Clynder{" +
                "height=" + height +
                ",volumn: " + volumn() + '}';
    }
}
