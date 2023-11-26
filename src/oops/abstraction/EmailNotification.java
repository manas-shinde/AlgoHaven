package oops.abstraction;

public class EmailNotification implements Notifiable {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending email notification to " + this.email);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribe " + this.email + " to email notification for topic : " + topic);
    }
}
