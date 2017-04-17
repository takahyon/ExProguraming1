package kg02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Box {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getArea() {
        return width * height;
    }

}
