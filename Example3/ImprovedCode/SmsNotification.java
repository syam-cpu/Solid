package Example3.ImprovedCode;

public class SmsNotification implements Notification{

    @Override
    public void sendMessage(String message)
    {
        System.out.println("Send Sms notification: " + message);
    }
}
