package adapter;

import visitor.Surface;
import visitor.Visitable;
import visitor.Visitor;

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
