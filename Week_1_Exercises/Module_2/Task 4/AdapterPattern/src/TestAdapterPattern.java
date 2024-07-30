public class TestAdapterPattern {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(100.0);

        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.0);

        Square square = new Square();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        squareProcessor.processPayment(300.0);
    }
}
