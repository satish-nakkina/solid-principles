package ecommerce.LSP;

import ecommerce.DIP.Order;
import ecommerce.ISP.PaymentGateway;
import ecommerce.OCP.PaypalGateway;
import ecommerce.SRP.User;

import java.util.Arrays;
import java.util.List;

public class EcommerceApp {
    public static void main(String[] args) {
        User user = new User("John", "john@example.com", "123 Main St.");
        List<Product> products = Arrays.asList(
                new DiscountedProduct("Product 1", 10.0,0.4),
                new Product("Product 2", 20.0),
                new DiscountedProduct("Product 3", 30.0,0.25)
        );

        Product p=new Product("product 4",30.0);
        Product d=new DiscountedProduct("Product 3", 30.0,0.5);

        System.out.println(p.getDiscountedPrice());
        PaymentGateway paymentGateway = new PaypalGateway();
        Order order = new Order(user, products, paymentGateway);

        if (order.processPayment()) {
            System.out.println("Payment processed successfully!");
            System.out.println("Total amount is "+order.getTotal());

        } else {
            System.out.println("Payment failed!");

        }
    }
}