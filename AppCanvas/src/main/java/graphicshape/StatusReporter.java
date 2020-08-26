package graphicshape;

import nestedClasses.interfaceTest;

public class StatusReporter {
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
        return new Shape.Color() {
            @Override
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
        };
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0,0,0));
        System.out.println(descriptiveColor);
    }
}
