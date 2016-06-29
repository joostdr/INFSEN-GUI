package optional;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 28-6-2016.
 */
public class None<T> implements IOption<T> {

    public None() {
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
        return onNone.get();
    }
}
