public abstract class NotifierDeco implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDeco(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
