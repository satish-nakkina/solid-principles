package ecommerce.OCP;


import ecommerce.LSP.Product;

public class ShipProduct extends Product {
    private double weight;
    public ShipProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }



    public double getWeight() {
        return weight;
    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}
