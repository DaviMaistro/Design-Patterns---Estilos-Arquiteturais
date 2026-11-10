public class SMSNotificationFactory extends NotificationFactory {
    public NotificationFactory_Method createNotification() {
        return new SMSNotification();
    }
}
