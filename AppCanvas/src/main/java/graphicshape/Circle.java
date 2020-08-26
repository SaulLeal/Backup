package graphicshape;

public class Circle extends Shape {

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
            if (obj instanceof Circle.Point2D) {
                Circle.Point2D objPoint2D = (Circle.Point2D) obj;
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

    }

    private final Point2D center;
    private final int radius;

    public Circle(int x,int y,int r) {
        center = this.new Point2D(x, y);
        radius = r;
    }

    public Circle(int x, int y) {
        this(x, y, 10);
    }

    public Circle() {
        this(20,20,10);
    }

    @Override
    public String toString() {
        return "center: (" + center + ") and radius: " + radius;
    }

    @Override
    public boolean equals(Object arg) {
        if (this == arg) return true;
        if (arg == null || getClass() != arg.getClass()) return false;
        if (arg instanceof Circle) {
            Circle that = (Circle) arg;
            return ((this.center.getXPos() == that.center.getXPos()) && (this.center.getYPos() == that.center.getYPos()) && (this.radius == that.radius));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (7 * center.getXPos()) ^ (11 * center.getYPos()) ^ (53 * radius);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void fillColor(int red, int green, int blue) {
        System.out.println("fill color with RGB method");
    }

    public void fillColor(float hue, float saturation, float brightness) {
        System.out.println("fill color with HSB method");
    }
}
