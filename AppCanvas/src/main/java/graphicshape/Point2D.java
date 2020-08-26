package graphicshape;

public class Point2D {
    private final int xPos;
    private final int yPos;

    public Point2D(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public String toString() {
        return "x = " + xPos + "\t, y = " + yPos + "\t";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Point2D) {
            Point2D objPoint2D = (Point2D) obj;
            return (xPos == objPoint2D.xPos) && (yPos == objPoint2D.yPos);
        }
        return false;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public static void main(String[] args) {
        System.out.println(new Point2D(10, 20));
    }
}
