public class PushNotification implements NotificationFactory_Method {
    public void send(String message) {
        System.out.println("PushFactory enviando: \"" + message + "\"");
    }
}
