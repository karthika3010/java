
package notification.system;

public class SMSNotificationFactory extends Factory
{
     @Override
     public Notification createNotification()
    {
        return new SMSNotification();
    }
}
