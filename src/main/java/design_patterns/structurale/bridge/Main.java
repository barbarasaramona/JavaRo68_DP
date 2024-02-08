package design_patterns.structurale.bridge;

public class Main {

    public static void main(String[] args) {

        Shape triunghi = new Triangle(new RedColor());

        triunghi.applyShapeColor();

        Shape pentagon = new Pentagon(new GreenColor());
        System.out.println();
        pentagon.applyShapeColor();

        Shape triunghi2 = new Triangle(new Color() {
            @Override
            public void applyColor() {
                System.out.print(" albastru");
            }
        });
        System.out.println();

        triunghi2.applyShapeColor();

        Shape cerc = new Shape(new Color() {
            @Override
            public void applyColor() {
                System.out.println(" mov ");
            }
        }) {
            @Override
            protected void applyShapeColor() {
                System.out.print("cerc colorat cu ");
                color.applyColor();
            }
        };

        System.out.println();
        cerc.applyShapeColor();


    }

}
