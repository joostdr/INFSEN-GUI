package practicumassignment2.iterator;

import java.util.ArrayList;

/**
 * Created by joost on 29-6-2016.
 */
public class Collection implements Iterator {

    ArrayList<Integer> intList;

    private Collection() {
        intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
    }

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.printList(collection.createIterator());
    }

    @Override
    public java.util.Iterator createIterator() {
        return intList.iterator();
    }

    private void printList(java.util.Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
