package iterator2;

import optional.IOption;

/**
 * Created by joost on 4-7-2016.
 */
public interface Iterator<T> {

    public IOption<T> getNext();

    public boolean hasNext();

}
