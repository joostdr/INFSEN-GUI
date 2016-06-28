package iterator;

import factory.ElementFactory;
import factory.LabelElement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joost on 27-6-2016.
 */
public class Labels implements IteratorForGui {

    private ArrayList<JLabel> allLabels;

    public Labels() {
        allLabels = new ArrayList<JLabel>();
        addLabel(((LabelElement) ElementFactory.createElement("Label","label1","")).getLabel());
        addLabel(((LabelElement)ElementFactory.createElement("Label","label2","")).getLabel());
        addLabel(((LabelElement)ElementFactory.createElement("Label","label3","")).getLabel());
    }

    public void addLabel(JLabel image){
        allLabels.add(image);
    }

    public ArrayList<JLabel> getAllLabels() {
        return allLabels;
    }

    public void setAllLabels(ArrayList<JLabel> allLabels) {
        this.allLabels = allLabels;
    }

    public Iterator createIterator() {
        return allLabels.iterator();
    }
}
