package ss6.point_moveablepoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point(){
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float arr[]={this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", x,y = "+ Arrays.toString(getXY())+"}";
    }
}
