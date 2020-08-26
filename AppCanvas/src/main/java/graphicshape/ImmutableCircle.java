package graphicshape;

public final class ImmutableCircle {
    private final Point2D center;
    private final int radius;

    public ImmutableCircle(int x, int y, int r) {
        center = new Point2D(x, y);
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public Point2D getCenter() {
        return new Point2D(center.getXPos(), center.getYPos());
    }

    @Override
    public String toString() {
        return "center: (" + center + ") and radius: " + radius;
    }

    @Override
    public boolean equals(Object arg) {
        if (this == arg) return true;
        if (arg == null || getClass() != arg.getClass()) return false;
        if (arg instanceof ImmutableCircle) {
            ImmutableCircle that = (ImmutableCircle) arg;
            return ((this.center.getXPos() == that.center.getXPos()) && (this.center.getYPos() == that.center.getYPos()) && (this.radius == that.radius));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (7 * center.getXPos()) ^ (11 * center.getYPos()) ^ (53 * radius);
    }
}
