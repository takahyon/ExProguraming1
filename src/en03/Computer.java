package en03;

/**
 * Created by shouta on 2017/04/24.
 */
public class Computer {
    private String os = "UNKNOWN";
    private int ram = 8;
    private int disk = 512;

    public Computer() {

    }

    public Computer(String os) {
        this.os = os;
    }

    public Computer(String os, int ram) {
        this.os = os;
        this.ram = ram;
    }

    public String getOS() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }


}
