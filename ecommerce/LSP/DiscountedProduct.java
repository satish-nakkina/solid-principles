package ecommerce.LSP;


import ecommerce.SRP.Product;

public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return getPrice() * (1 - discount);
    }

    public void productDetails(){
        System.out.println("product details");
    }
}