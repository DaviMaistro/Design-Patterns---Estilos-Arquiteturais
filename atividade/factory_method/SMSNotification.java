public class SMSNotification implements NotificationFactory_Method {
    public void send(String message) {
        System.out.println("SMSFactory enviando: \"" + message + "\"");
    }
}
