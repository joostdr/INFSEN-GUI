package iterator2;

import java.util.ArrayList;

/**
 * Created by joost on 4-7-2016.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("String 1");
        arrayList.add("String 2");
        arrayList.add("String 3");

        Array<String> array = new Array<>(arrayList);

        while(array.hasNext()){
            System.out.println(array.getNext().getValue());
        }

    }

}
