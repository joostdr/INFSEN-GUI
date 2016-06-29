package practicumassignment2.option;

/**
 * Created by joost on 29-6-2016.
 */
public class Main {

    public static void main(String[] args) {
        Some<String> someString = new Some<String>("String");
        None<String> noneString = new None<String>();
        Some<Integer> someInteger = new Some<Integer>(100);

        System.out.println(someString.getValue());
        System.out.println(someInteger.getValue());
        System.out.println(noneString.getValue());
    }

}
