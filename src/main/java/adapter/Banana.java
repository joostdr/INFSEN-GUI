package adapter;

import visitor.surface.Surface;
import visitor.surface.Visitable;
import visitor.surface.Visitor;

/**
 * Created by joost on 26-6-2016.
 */
public class Banana implements Visitable {

    public String bananaImage(){
        return "banana.jpg";
    }

    @Override
    public Surface accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
