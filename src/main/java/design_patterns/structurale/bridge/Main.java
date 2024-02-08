package design_patterns.structurale.bridge;

public class Main {
    public static void main(String[] args) {
        Shape triunghi = new Triangle(new RedColor());
        triunghi.applyShapeColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyShapeColor();

        Shape triunghi2 = new Triangle(new Color() {
            @Override
            public void applyColor() {
                System.out.println("albastru");
            }
        });
        triunghi2.applyShapeColor();
    }
}
