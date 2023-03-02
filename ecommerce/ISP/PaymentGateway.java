package ecommerce.ISP;

import ecommerce.DIP.Order;

public interface PaymentGateway {
    boolean processPayment(Order order);
}