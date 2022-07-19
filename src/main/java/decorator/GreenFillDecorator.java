package decorator;

import domain.shape.Shape;

public class GreenFillDecorator extends ShapeDecorator {

    public GreenFillDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setFillGreen(decoratorShape);
    }

    private void setFillGreen(Shape decoratedShape){
        System.out.println("Fill color: Green");
    }
}
