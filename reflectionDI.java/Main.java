public class Main {

    public static void main(String[] args) {

        try {

            // Create Car object
            Car car = new Car();

            // Inject dependencies using Reflection
            ReflectionInjector.inject(car);

            // Test the injected object
            car.drive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}