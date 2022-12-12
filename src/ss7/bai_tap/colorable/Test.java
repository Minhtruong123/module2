package ss7.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Square("blue", true, 5);
        geometries[1] = new Square("red", false, 4);
        geometries[2] = new Rectangle("yellow", true, 4, 5);


        System.out.println(geometries[0]);
        System.out.println();

        System.out.println(geometries[1]);
        System.out.println();

        System.out.println(geometries[2]);
    }
}
