package ecommerce.ISP;

import ecommerce.DIP.Order;
import ecommerce.ISP.PaymentGateway;

public class CreditCardGateway implements PaymentGateway {
    @Override
    public boolean processPayment(Order order) {
        // Code to process payment via credit card
        return true;
    }
}