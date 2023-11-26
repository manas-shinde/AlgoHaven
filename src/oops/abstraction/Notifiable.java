package oops.abstraction;

public interface Notifiable {
    void sendNotification(String msg);

    default void subscribeToTopic(String topic) {
        System.out.println("Subscribe to notifications for topic: " + topic);
    }
}
