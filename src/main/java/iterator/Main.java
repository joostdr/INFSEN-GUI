package iterator;

import java.util.Iterator;

/**
 * Created by joost on 27-6-2016.
 */
public class Main {

    IteratorForGui buttons;
    IteratorForGui images;

    public static void main(String[] args) {
        Main main = new Main();
        main.buttons = new Buttons();
        main.images = new Images();
        main.printInfo(main.buttons.createIterator());
        main.printInfo(main.images.createIterator());

    }

    public void printInfo(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
