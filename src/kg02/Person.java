package kg02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setParams(double h, double w) {
        height = h;
        weight = w;
    }

    public double getBMI() {
        return weight / (height * height);
    }

}
