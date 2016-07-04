package iterator2;

import optional.IOption;
import optional.None;
import optional.Some;

import java.util.ArrayList;

/**
 * Created by joost on 4-7-2016.
 */
public class Array<T> implements Iterator<T>  {

    private ArrayList<T> arrayList;
    private int index;
    private boolean hasNext;

    public Array(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
        this.hasNext = true;
        this.index=-1;
    }

    @Override
    public IOption<T> getNext() {
        if((index + 1) >= arrayList.size()){
            this.hasNext = false;
            return new None<>();
        }else{
            index++;
            return new Some<>(arrayList.get(index));
        }
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
}
