package Shapes.entities;

public class Circle extends AbstractShape {
    private Double radius;
    private static Double PI = 3.14;

    public Circle(COLOR color, Double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public Double area() {
        return (PI) * (Math.pow(radius, 2.0));
    }
}
