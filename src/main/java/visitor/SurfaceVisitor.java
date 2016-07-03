package visitor;

import adapter.Apple;
import adapter.Banana;
import adapter.Grape;

/**
 * Created by joost on 27-6-2016.
 */

/**
 * SurfaceVisitor is visited by AppleImage, Banana or Grape
 * The width and height gets set by calling accept on a instance of these classes
 * accept takes a surfacevisitor
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
