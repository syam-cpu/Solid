package Example3.BetterCode;

public class NotificationSender {

    public void sendNotifcations(List<String> notificationTypes, String message)
    {
        for (String notificationType : notificationTypes)
        {
            switch(notificationType)
            {
                case "EMAIL":
                    EmailNotification notification = new EmailNotification();
                    notification.sendEmailNotification(message);
                    break;
                case "SMS":
                    SmsNotification notifaction = new SmsNotification();
                    notifaction.sendSmsNotification(message);
                    break;
                case "PUSH":
                    PushNotification notification =  new PushNotification();
                    notification.sendPushNotification(message);
                    break;
            }

        }
    }
    
}
