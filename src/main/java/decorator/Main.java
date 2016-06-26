package decorator;

/**
 * Created by joost on 26-6-2016.
 */
public class Main {
    public static void main(String[] args) {
        //factory
        //adapter
        //decorator
        //visitor
        //iterator
        //option

        Window testWindow = new BasicWindow();
        testWindow.getDescription();
        testWindow = new HorizontalScrollBar(testWindow);
        testWindow.getDescription();
        testWindow = new VerticalScrollBar(testWindow);
        testWindow.getDescription();
    }
}

