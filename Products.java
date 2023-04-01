public class Products {
    public String name;
    public Float price;

    public Products(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}