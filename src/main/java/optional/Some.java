package optional;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 28-6-2016.
 */
public class Some<T> implements IOption<T> {

    T value;

    public Some(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
        return onSome.apply(value);
    }
}
