import adapter.*;
import factory.ButtonElement;
import factory.ElementFactory;
import iterator.Buttons;
import iterator.IterableArray;
import iterator.IteratorForGui;
import iterator.Labels;
import optional.IOption;
import optional.None;
import optional.Some;
import visitor.Surface;
import visitor.SurfaceVisitor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by joost on 28-6-2016.
 */
public class ContentSetter {

    Map<String, Component> componentMap;
    ArrayList<JLabel> allLabels;
    ArrayList<ImageIcon> allImages;

    /**
     * addButtons adds the buttons to the JFrame
     * text in the buttons is supplied by a Some of type String
     * The buttons are supplied by src/java/iterator/Buttons.class
     * USES ITERATOR, OPTION
     * @param frame
     */

    public void addButtons(JFrame frame) {
        Buttons buttons = new Buttons();
        IteratorForGui iterator = new IterableArray(buttons.getAllButtons());
        int x = 150;
        while (iterator.hasNext()) {
            IOption someOrNone = iterator.getNext();
            if(someOrNone instanceof Some){
                JButton button = (JButton) someOrNone.getValue();
                button.setBounds(x, 550, 120, 40);
                frame.add(button);
            }
            x += 350;
        }
    }

    /**
     * addLabels adds the labels to the JFrame using a iterator
     * The labels are supplied by src/java/iterator/labels.class
     * USES ITERATOR
     * @param frame
     */

    public void addLabels(JFrame frame) {
        Labels labels = new Labels();
        int x = 150;
        IteratorForGui iterator = new IterableArray(labels.getAllLabels());
        while (iterator.hasNext()) {
            IOption someOrNone = iterator.getNext();
            if(someOrNone instanceof Some){
                JLabel label = (JLabel) someOrNone.getValue();
                label.setBounds(x, 250, 200, 200);
                frame.add(label);
            }
            x += 350;
        }
    }

    /**
     * getAllLabels returns all the labels created by addLabels
     * the labels are put in an arraylist
     * @param frame
     */

    public void getAllLabels(JFrame frame) {
        allLabels = new ArrayList<JLabel>();
        Component[] component = frame.getContentPane().getComponents();
        for (int i = 0; i < component.length; i++) {
            if (component[i] instanceof JLabel) {
                allLabels.add((JLabel) component[i]);
            }
        }
    }

    /**
     * readImage reads the supplied image and scales it to the supplied dimensions
     * it returns an ImageIcon with the scaled image
     * @param fruitImage
     * @param height
     * @param width
     * @return
     */

    private ImageIcon readImage(AppleImage fruitImage, int height, int width) {
        BufferedImage img;
        Image scaledImg = null;
        try {
            img = ImageIO.read(new File("src/main/resources/" + fruitImage.appleImage()));
            scaledImg = img.getScaledInstance(height,width, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageIcon(scaledImg);
    }

    /**
     * createIconList creates an arraylist with the images which need to be added to the labels
     * USES ADAPTER, VISITOR
     */

    public void createIconList() {
        allImages = new ArrayList<>();
        Apple apple = new Apple();
        Banana banana = new Banana();
        Grape grape = new Grape();

        SurfaceVisitor surfaceVisitor = new SurfaceVisitor();

        Surface appleSurface = apple.accept(surfaceVisitor);
        Surface bananaSurface = banana.accept(surfaceVisitor);
        Surface grapeSurface = grape.accept(surfaceVisitor);

        allImages.add(readImage(apple, appleSurface.getHeight(), appleSurface.getWidth()));
        allImages.add(readImage(new BananaImageAdapter(banana), bananaSurface.getHeight(), bananaSurface.getWidth()));
        allImages.add(readImage(new GrapeImageAdapter(grape), grapeSurface.getHeight(), grapeSurface.getWidth()));
    }

    /**
     * setIcons adds the images to the labels
     */

    public void setIcons(){
        for (int j = 0; j < allImages.size() ; j++) {
            allLabels.get(j).setIcon(allImages.get(j));
        }
    }

    /**
     * createNone adds a button to the JFrame which contains a none string
     * @param frame
     */

    public void createNone(JFrame frame){
        JButton noneButton = ((ButtonElement)ElementFactory.createElement("Button","button","")).getButton();
        noneButton.setBounds(500,100,120,40);
        IOption<String> none = new None<>();
        noneButton.setText(none.getValue());
        frame.add(noneButton);
    }
}
