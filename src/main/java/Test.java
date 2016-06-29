import optional.*;

/**
 * Created by joost on 28-6-2016.
 */
public class Test {

    IOption option;
    public static void main(String[] args) {
        IOption<String> some = new Some<>("Hoi");
        String out = some.visit(()->"None!",(x) -> x);
        System.out.println(out);
    }

}
