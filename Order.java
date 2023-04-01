import java.util.List;

public class Order {

    public List<Products> products;
    public String userName;

    public Order(String name, List<Products> products) {
        this.products = products;
        userName = name;
    }

    public float returnPrice() {
        float price = 0;
        for (Products product : products) {
            price += product.price;
        }
        return price;
    }
}