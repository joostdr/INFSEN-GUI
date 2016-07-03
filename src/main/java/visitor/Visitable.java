package visitor;

/**
 * Created by joost on 27-6-2016.
 */

/**
 * Visitable gets implemented by Apple, Banana or grape so that accept can be called
 */
public interface Visitable {

    public Surface accept(Visitor visitor);

}
