public class CreditCardPayment implements PaymentStrategy {

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }
}
