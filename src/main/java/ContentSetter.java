import adapter.*;
import iterator.Buttons;
import iterator.IteratorForGui;
import iterator.Labels;
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

    public void addButtons(JFrame frame) {
        IteratorForGui buttons = new Buttons();
        int x = 150;
        Iterator iterator = buttons.createIterator();
        while (iterator.hasNext()) {
            JButton button = (JButton) iterator.next();
            button.setBounds(x, 550, 120, 40);
            frame.add(button);
            x += 350;
        }
    }

    public void addLabels(JFrame frame) {
        IteratorForGui labels = new Labels();
        int x = 150;
        Iterator iterator = labels.createIterator();
        while (iterator.hasNext()) {
            JLabel label = (JLabel) iterator.next();
            label.setBounds(x, 250, 200, 200);
            frame.add(label);
            x += 350;
        }
    }

    public void getElements(JFrame frame) {
        allLabels = new ArrayList<JLabel>();
        Component[] component = frame.getContentPane().getComponents();
        for (int i = 0; i < component.length; i++) {
            if (component[i] instanceof JLabel) {
                allLabels.add((JLabel) component[i]);
            }
        }
    }

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

    private ImageIcon readImage(AppleImage fruitImage, int height, int width) {
        BufferedImage img = null;
        Image scaledImg = null;
        try {
            img = ImageIO.read(new File("src/main/resources/" + fruitImage.appleImage()));
            scaledImg = img.getScaledInstance(height,width, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageIcon(scaledImg);
    }

    public void setIcons(){
        for (int j = 0; j < allImages.size() ; j++) {
            allLabels.get(j).setIcon(allImages.get(j));
        }
    }
}
