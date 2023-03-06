package ecommerce.ISP;

public interface DiscountablePaymentGateway extends PaymentGateway, Discount,Receipt {

  void paymentDetails();
}
