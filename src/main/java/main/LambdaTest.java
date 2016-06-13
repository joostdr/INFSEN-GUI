package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by joost on 13-6-2016.
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        /*for(int integer : integerList){
            System.out.println(integer);
        }*/
        //integerList.forEach((Integer value) -> System.out.println(value));
    }

}
