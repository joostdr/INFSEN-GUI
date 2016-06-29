package practicumassignment;

/**
 * Created by joost on 29-6-2016.
 */
public class Main {

    public static void main(String[] args) {
        Option<String> someString = new Some<>("This is a string");
        System.out.println(someString.isSome());
        Option<String> noneString = new None<>();
        System.out.println(noneString.isSome());

        String output = noneString.accept(()->"None",(x)->x);
        System.out.println(output);
    }

}
