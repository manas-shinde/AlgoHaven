package oops.abstraction;

public class SMSNotification implements Notifiable {
    private String mobileNo;

    public SMSNotification(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending SMS notification to " + this.mobileNo);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribe " + this.mobileNo + " to SMS notification for topic : " + topic);
    }
}
