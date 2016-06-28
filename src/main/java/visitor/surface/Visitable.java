package visitor.surface;

/**
 * Created by joost on 27-6-2016.
 */
public interface Visitable {

    public Surface accept(Visitor visitor);

}
