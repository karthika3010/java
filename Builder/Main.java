public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();

        System.out.print("Add SSD? ");
        boolean ssd = sc.nextBoolean();

        System.out.print("Add Graphics Card? ");
        boolean graphics = sc.nextBoolean();

        System.out.print("Add Extended Warranty? ");
        boolean warranty = sc.nextBoolean();

        System.out.print("Add MS Office? ");
        boolean office = sc.nextBoolean();

        Laptop laptop = new Laptop.LaptopBuilder(brand, ram)
                .setSSD(ssd)
                .setGraphicsCard(graphics)
                .setExtendedWarranty(warranty)
                .setMsOffice(office)
                .build();

        laptop.display();
    }
}