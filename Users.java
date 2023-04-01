public class User
{
    private String fullName;
    List<Products> cart;
    List<Order> orders;

    public void addProduct(Products product)
    {
        cart.add(product);
    }
}