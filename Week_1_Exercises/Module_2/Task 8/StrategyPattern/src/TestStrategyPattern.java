public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "Josna Vincy", "123", "05/25");
        context.setPaymentStrategy(creditCard);
        context.executePayment(2500.00);

        PaymentStrategy payPal = new PayPalPayment("josna@EgMail.com", "password");
        context.setPaymentStrategy(payPal);
        context.executePayment(1250.00);
    }
}
