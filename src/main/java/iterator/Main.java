package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by joost on 27-6-2016.
 */
public class Main {

    IteratorForGui buttons;
    IteratorForGui images;

    public static void main(String[] args) {
        Main main = new Main();
       /* main.buttons = new Buttons();
        main.images = new Labels();
        main.printInfo(main.buttons.getNext());
        main.printInfo(main.images.getNext());*/

    }

    public void printInfo(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
