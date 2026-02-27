
package notification.system;


public class EmailNotification implements Notification
{

    @Override
    public void sendmessge()
    {
       System.out.println("Sending Email Notification");
    }
    
}
