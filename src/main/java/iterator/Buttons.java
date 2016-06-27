package iterator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joost on 27-6-2016.
 */
public class Buttons implements IteratorForGui {

    private ArrayList<JButton> allButtons;

    public Buttons() {
        allButtons = new ArrayList<JButton>();
        addButton(new JButton("button1"));
        addButton(new JButton("button2"));
        addButton(new JButton("button3"));
    }

    public void addButton(JButton button){
        allButtons.add(button);
    }

    public Iterator createIterator() {
        return allButtons.iterator();
    }
}
