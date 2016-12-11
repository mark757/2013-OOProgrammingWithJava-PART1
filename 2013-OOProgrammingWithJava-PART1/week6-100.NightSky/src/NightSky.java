/**
 * Created by Mark on 12/9/2016.
 */

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    /*
    public NightSky() {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = starsInLastPrint;
    }
    */

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        String star = "*";
        String space = " ";
        String line = "";

        for (int i = 0; i < width; i++) {
            if (density == 1) {
                line += star;
                starsInLastPrint++;
            } else if (Math.random() <= density) {
                line += star;
                starsInLastPrint++;
            } else {
                line += space;
            }

        }
        System.out.println(line);

    }

    public void print() {
        //String[] stars = new String[width * height];
        starsInLastPrint = 0;
        //System.out.println(stars.length);
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}

