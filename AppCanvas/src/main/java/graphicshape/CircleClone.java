package graphicshape;

public class CircleClone extends Shape.CircularShape {
    private int xPos, yPos, radius;

    public CircleClone(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void roll(float degree) {
        System.out.printf("rolling circle by %f degrees", degree);
    }

    public static void main(String[] args) {
        CircleClone circleClone = new CircleClone(10,10,20);
        circleClone.roll(45);
    }
}
