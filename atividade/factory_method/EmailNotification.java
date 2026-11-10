public class EmailNotification implements NotificationFactory_Method {
    public void send(String message) {
        System.out.println("EmailFactory enviando: \"" + message + "\"");
    }
}
