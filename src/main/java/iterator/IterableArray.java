package iterator;

import optional.IOption;
import optional.None;
import optional.Some;

import java.util.ArrayList;

/**
 * Created by joost on 4-7-2016.
 */
public class IterableArray<T> implements IteratorForGui<T> {

    private ArrayList<T> arrayList;
    private int index = -1;
    private boolean hasNext;

    public IterableArray(ArrayList<T> arrayList) {
        hasNext = true;
        this.arrayList = arrayList;
    }

    @Override
    public IOption<T> getNext() {
        if((index + 1) >= arrayList.size()){
            this.hasNext = false;
            return new None<>();
        }
        else{
            index = (index+1);
            return new Some<>(arrayList.get(index));
        }
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }
}
