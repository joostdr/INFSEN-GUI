package adapter;

import visitor.surface.Surface;
import visitor.surface.Visitable;
import visitor.surface.Visitor;

/**
 * Created by joost on 27-6-2016.
 */
public class Grape implements Visitable {

    public String grapeImage() {
        return "grapes.jpg";
    }

    @Override
    public Surface accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
