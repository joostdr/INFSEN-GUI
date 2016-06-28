package iterator;

import factory.ButtonElement;
import factory.ElementFactory;

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
        addButton(((ButtonElement)ElementFactory.createElement("Button","button1","")).getButton());
        addButton(((ButtonElement)ElementFactory.createElement("Button","button2","")).getButton());
        addButton(((ButtonElement)ElementFactory.createElement("Button","button3","")).getButton());
    }

    public void addButton(JButton button){
        allButtons.add(button);
    }

    public ArrayList<JButton> getAllButtons() {
        return allButtons;
    }

    public void setAllButtons(ArrayList<JButton> allButtons) {
        this.allButtons = allButtons;
    }

    public Iterator createIterator() {
        return allButtons.iterator();
    }
}
