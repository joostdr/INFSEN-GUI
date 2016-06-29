package practicumassignment;

import java.util.function.Function;

/**
 * Created by joost on 29-6-2016.
 */
public interface Map<T> extends Option<T> {

    public <U> U createMap(Option<T> option, Function<T, U> function);

}
