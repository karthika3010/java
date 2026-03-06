import java.util.Scanner;

public class StringMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringOperations op = new StringOperations();

        int choice;

        do
        {
            System.out.println("\n--- String Operations ---");
            System.out.println("1. Length");
            System.out.println("2. Reverse");
            System.out.println("3. Uppercase");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter string: ");
                    String str1 = sc.nextLine();
                    System.out.println("Length: " + op.getLength(str1));
                    break;

                case 2:
                    System.out.print("Enter string: ");
                    String str2 = sc.nextLine();
                    System.out.println("Reverse: " + op.reverse(str2));
                    break;

                case 3:
                    System.out.print("Enter string: ");
                    String str3 = sc.nextLine();
                    System.out.println("Uppercase: " + op.toUpper(str3));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}