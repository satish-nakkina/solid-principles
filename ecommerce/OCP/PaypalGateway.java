package ecommerce.OCP;

import ecommerce.DIP.Order;
import ecommerce.ISP.PaymentGateway;

public class PaypalGateway implements PaymentGateway {

    @Override
    public boolean processPayment(Order order) {
        return true;
    }
}
