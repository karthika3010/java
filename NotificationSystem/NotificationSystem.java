
package notification.system;


public class NotificationSystem {


    public static void main(String[] args) 
    {
        
        Factory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.sendmessage();

       
        Factory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.sendmessage();

     
        Factory pushFactory = new PushNotificationFactory();
        Notification push = pushFactory.createNotification();
        push.sendmessage();
        
    }
    
}
