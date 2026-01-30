import java.util.Scanner;
class LibrarySystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[50];
        int count = 0;
        int choice;

        do
        {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books[count++] = new Book(id, title, author);
                    break;

                case 2:
                    for(int i=0; i<count; i++)
                        books[i].display();
                    break;

                case 3:
                    System.out.print("Enter book ID to borrow: ");
                    int bid = sc.nextInt();

                    for(int i=0; i<count; i++)
                        if(books[i].bookID == bid)
                            books[i].borrowBook();
                    break;

                case 4:
                    System.out.print("Enter book ID to return: ");
                    int rid = sc.nextInt();

                    for(int i=0; i<count; i++)
                        if(books[i].bookID == rid)
                            books[i].returnBook();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}