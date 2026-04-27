package Example3.ImprovedCode;

public class NotificationSender {

    public void sendNotifcations(List<Notifcation> notificationTypes, String message)
    {
        for (Notification notification : notificationTypes)
        {
            notification.sendMessage(message);
        }
    }
}
// does nt care if we remove a notification or add an new notification.
