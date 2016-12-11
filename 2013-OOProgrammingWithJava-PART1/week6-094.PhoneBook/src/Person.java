/**
 * Created by Mark on 12/5/2016.
 */
public class Person {
    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + " number: " + number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String newNumber) {
        number = newNumber;
    }

}
