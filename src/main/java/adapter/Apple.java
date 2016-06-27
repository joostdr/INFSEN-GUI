package adapter;

import visitor.Surface;
import visitor.Visitable;
import visitor.Visitor;

/**
 * Created by joost on 26-6-2016.
 */
public class Apple implements AppleImage, Visitable{

    @Override
    public void showApple() {
        System.out.println("Apple");
    }

    @Override
    public void getColor() {
        System.out.println("Green");
    }

    @Override
    public Surface accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
