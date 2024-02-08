package design_patterns.structurale.bridge;

public class Pentagon extends Shape{


    public Pentagon(Color color){

        super(color);

    }
    @Override
    protected void applyShapeColor() {

        System.out.print("Pentagon colorat cu ");
        color.applyColor();

    }
}
