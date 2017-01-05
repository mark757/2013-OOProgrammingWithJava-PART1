import java.util.ArrayList;

/**
 * Created by Mark on 12/14/2016.
 */
public class Bird {
    private String name;
    private String latin;
    private int observation;
    private ArrayList<Bird> list;

    public Bird(String name, String latin) {
        list = new ArrayList<Bird>();
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public void increaseObserve() {
        observation++;
    }

    public String toString() {
        return name + " (" + latin + "): " + observation + " observations";
    }

    public String getName() {
        return name;
    }

}
