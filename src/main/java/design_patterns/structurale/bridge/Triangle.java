package design_patterns.structurale.bridge;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    protected void applyShapeColor() {
        System.out.print("Triunghi colorat cu ");
        color.applyColor();

    }
}
