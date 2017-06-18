package en03;

/**
 * Created by shouta on 2017/05/08.
 */
public class Triangle {
    double s;
    double area;
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public boolean isTriangle() {
        if (a < (b + c) && b < (c + a) && c < (a + b)) {
            return true;

        } else {
            return false;
        }
    }
}
