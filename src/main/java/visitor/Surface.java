package visitor;

/**
 * Created by joost on 27-6-2016.
 */
public class Surface {

    private double width;
    private double height;

    public Surface() {
    }

    public Surface(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
