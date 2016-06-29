package visitor;

import adapter.Apple;
import adapter.Banana;
import adapter.Grape;

/**
 * Created by joost on 27-6-2016.
 */
public class SurfaceVisitor implements Visitor {
    @Override
    public Surface visit(Apple apple) {
        return new Surface(60,60);
    }

    @Override
    public Surface visit(Banana banana) {
        return new Surface(100,100);
    }

    @Override
    public Surface visit(Grape grape) {
        return new Surface(140,140);
    }

}
