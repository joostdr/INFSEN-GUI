package practicumassignment;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 29-6-2016.
 */
public class None<T> implements Option<T> {

    public None() {
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public boolean isSome() {
        return false;
    }

    @Override
    public <U> U accept(Supplier<U> consumer, Function<T, U> function) {
        return consumer.get();
    }
}
