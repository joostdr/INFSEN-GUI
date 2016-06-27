package adapter;

import visitor.Surface;
import visitor.Visitable;
import visitor.Visitor;

/**
 * Created by joost on 27-6-2016.
 */
public class Grape implements Visitable {

    public void showGrape(){
        System.out.println("Grape");
    }

    public void getColor(){
        System.out.println("purple");
    }

    @Override
    public Surface accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
