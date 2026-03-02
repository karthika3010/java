public class BuilderDemo
{
    public static void main(String[] args)
    {
        Computer comp1 = new Computer.Builder("Intel i7", 16)
                                .setHDD(1024)
                                .setGraphics(true)
                                .build();

        Computer comp2 = new Computer.Builder("Ryzen 5", 8)
                                .build();

        System.out.println("Computer 1:");
        System.out.println(comp1.getCPU());
        System.out.println(comp1.getRAM());
        System.out.println(comp1.getHDD());
        System.out.println(comp1.hasGraphics());

        System.out.println("\nComputer 2:");
        System.out.println(comp2.getCPU());
        System.out.println(comp2.getRAM());
        System.out.println(comp2.getHDD());
        System.out.println(comp2.hasGraphics());
    }
}