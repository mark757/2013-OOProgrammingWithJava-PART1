/**
 * Created by Mark on 11/17/2016.
 */
public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    public void printProduct(){
        System.out.println(this.name + ", " + "price " + this.price + ", " + "amount " + this.amount);
    }
}
