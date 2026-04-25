package Example3.ProblamaticCode;

public class NotificationSender {
    public void sendNotifications(List<NotficationType> notificationTypes, String message)
    {
        for (NotificationType notificationType : notificationTypes)
        {
            switch (notificationType) {
                case SMS:
                    notificationType.sendSMSNotification(message);
                    break;
                
                case EMAIL:
                    notificationType.sendEmailNotification(message);
                    break;

                case PUSH:
                    notificationType.sendPushNotification(message);

                case WHATSAPP:
                    notificationType.sendWhatsAppNotification(message);
            
                default:
                    break;
            }
        }
    }
}
