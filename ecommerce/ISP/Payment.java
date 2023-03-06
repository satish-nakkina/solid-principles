package ecommerce.ISP;

import ecommerce.DIP.Order;

public class Payment implements DiscountablePaymentGateway{



    @Override
    public void paymentDetails() {
        System.out.println("order Details");
    }

    @Override
    public boolean processPayment(Order order) {
        return true;
    }

    @Override
    public void paymentReceipt() {
        System.out.println("payment receipt");
    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}
