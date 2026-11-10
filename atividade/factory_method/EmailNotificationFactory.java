public class EmailNotificationFactory extends NotificationFactory {
    public NotificationFactory_Method createNotification() {
        return new EmailNotification();
    }
}
