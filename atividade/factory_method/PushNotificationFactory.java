public class PushNotificationFactory extends NotificationFactory {
    public NotificationFactory_Method createNotification() {
        return new PushNotification();
    }
}
