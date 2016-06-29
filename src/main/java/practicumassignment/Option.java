package practicumassignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by joost on 29-6-2016.
 */
public interface Option<T> {

    public T getValue();

    public <U> U accept(Supplier<U> consumer, Function<T, U> function);

    public boolean isSome();

}
