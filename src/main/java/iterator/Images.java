package iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by joost on 27-6-2016.
 */
public class Images implements IteratorForGui {

    private String[] images;
    private int index = 0;

    public Images() {
        images =  new String[3];
        addImage("image1");
        addImage("image2");
        addImage("image3");
    }

    public void addImage(String image){
        images[index] = image;
        index++;
    }

    public Iterator createIterator() {
        return Arrays.asList(images).iterator();
    }
}
