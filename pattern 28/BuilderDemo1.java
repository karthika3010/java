public class BuilderDemo1
{
    public static void main(String[] args)
    {
        Student s1 = new Student.Builder(101, "Arun")
                            .setEmail("arun@gmail.com")
                            .setPhone("9876543210")
                            .setAddress("Chennai")
                            .build();

        Student s2 = new Student.Builder(102, "Kavi")
                            .build();

        System.out.println("Student 1:");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());
        System.out.println(s1.getPhone());
        System.out.println(s1.getAddress());

        System.out.println("\nStudent 2:");
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getEmail());
        System.out.println(s2.getPhone());
        System.out.println(s2.getAddress());
    }
}