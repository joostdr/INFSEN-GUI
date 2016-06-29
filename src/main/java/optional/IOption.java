package optional;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 28-6-2016.
 */
public interface IOption<T> {
    public T getValue();

    public <U> U visit(Supplier<U> onNone, Function<T, U> onSome);
}
