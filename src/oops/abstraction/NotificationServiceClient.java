package oops.abstraction;

public class NotificationServiceClient {
    public static void main(String[] args) {
        Notifiable emailService = new EmailNotification("user@gmail.com");
        Notifiable smsService = new SMSNotification("+911234567890");

        emailService.sendNotification("Hi, this is email notification service.");
        smsService.sendNotification("Hi, this is sms notification service.");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Price drop");

    }
}
