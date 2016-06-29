package practicumassignment2.option;

import practicumassignment.Option;

/**
 * Created by joost on 29-6-2016.
 */
public class Some<T> implements IOption<T> {

    private T value;

    public Some(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }
}
