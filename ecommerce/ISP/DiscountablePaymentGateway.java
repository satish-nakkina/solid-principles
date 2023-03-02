package ecommerce.ISP;

public interface DiscountablePaymentGateway extends PaymentGateway, Discount {

  void paymentDetails();
}
