import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class StudentManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Set<Integer> studentIds = new HashSet<>();
        Map<Integer, String> students = new HashMap<>();

        int choice;

        do
        {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Total Student Count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1: // Add Student
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    if (studentIds.contains(id))
                    {
                        System.out.println("Student ID already exists!");
                    }
                    else
                    {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        studentIds.add(id);
                        students.put(id, name);

                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2: // Remove Student
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    if (studentIds.contains(removeId))
                    {
                        studentIds.remove(removeId);
                        students.remove(removeId);
                        System.out.println("Student removed successfully.");
                    }
                    else
                    {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 3: // Search Student
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (students.containsKey(searchId))
                    {
                        System.out.println("Student Name: " + students.get(searchId));
                    }
                    else
                    {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Display All Students
                    if (students.isEmpty())
                    {
                        System.out.println("No students available.");
                    }
                    else
                    {
                        System.out.println("Student Details:");
                        for (Map.Entry<Integer, String> entry : students.entrySet())
                        {
                            System.out.println("ID: " + entry.getKey() +
                                               ", Name: " + entry.getValue());
                        }
                    }
                    break;

                case 5: // Total Count
                    System.out.println("Total Students: " + studentIds.size());
                    break;

                case 6: // Exit
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}