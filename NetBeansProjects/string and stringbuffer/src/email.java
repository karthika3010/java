
import java.util.Scanner;


public class email 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email ID: ");
        String email = sc.nextLine();

        // Conditions
        if (email.contains("@") &&
            email.contains(".") &&
            email.indexOf("@") < email.indexOf("."))
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
    

