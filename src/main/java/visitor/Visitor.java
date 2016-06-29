package visitor;

import adapter.Apple;
import adapter.Banana;
import adapter.Grape;

/**
 * Created by joost on 27-6-2016.
 */
public interface Visitor {

    public Surface visit(Apple apple);

    public Surface visit(Banana banana);

    public Surface visit(Grape grape);

}
