package practicumassignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 29-6-2016.
 */
public class Some<T> implements Option<T> {

    private T value;

    public Some(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public boolean isSome() {
        return true;
    }

    @Override
    public <U> U accept(Supplier<U> supplier, Function<T, U> function) {
        return function.apply(value);
    }
}
