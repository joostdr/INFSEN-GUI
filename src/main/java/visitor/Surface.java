package visitor;

/**
 * Created by joost on 27-6-2016.
 */
public class Surface {

    private int width;
    private int height;

    public Surface() {
    }

    public Surface(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
