package ss7.bai_tap.resizeable;

public abstract class Geometry {
    private boolean filled;

    public Geometry(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "filled=" + filled +
                '}';
    }
}
