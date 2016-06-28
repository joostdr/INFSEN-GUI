package adapter;

import visitor.surface.Surface;
import visitor.surface.Visitable;
import visitor.surface.Visitor;

/**
 * Created by joost on 26-6-2016.
 */
public class Apple implements AppleImage, Visitable {

    @Override
    public String appleImage() {
        return "apple.jpg";
    }

    @Override
    public Surface accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
