public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Your order has been placed.");

        Notifier smsNotifier = new SMSNotifier(emailNotifier);
        smsNotifier.send("Your order has been shipped.");

        Notifier slackNotifier = new SlackNotifier(smsNotifier);
        slackNotifier.send("Your order has been delivered.");
    }
}
