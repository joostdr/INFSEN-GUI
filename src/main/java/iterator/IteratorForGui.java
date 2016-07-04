package iterator;

import optional.IOption;

import java.util.Iterator;

/**
 * Created by joost on 27-6-2016.
 */
public interface IteratorForGui<T> {

    public IOption<T> getNext();

    public boolean hasNext();

}
