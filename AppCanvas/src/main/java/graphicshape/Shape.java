package graphicshape;

abstract class Shape {
    abstract double area();

    private Shape parentShape;

    public void setParentShape(Shape shape) {
        parentShape = shape;
    }

    public Shape getParentShape() {
        return parentShape;
    }

    interface Rollable {
        void roll(float degree);
    }

    abstract static class CircularShape extends Shape implements Rollable {}

    public static class Color {
        int m_red, m_green, m_blue;

        public Color() {
            this(0,0,0);
        }

        public Color(int red, int green, int blue) {
            m_red = red;
            m_green = green;
            m_blue = blue;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "m_red=" + m_red +
                    ", m_green=" + m_green +
                    ", m_blue=" + m_blue +
                    '}';
        }
    }
}
