package practicumassignment2.option;

/**
 * Created by joost on 29-6-2016.
 */
public class None<T> implements IOption<T>{

    public None() {
    }

    @Override
    public T getValue() {
        return null;
    }

}
