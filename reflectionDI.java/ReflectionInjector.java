import java.lang.reflect.Field;

public class ReflectionInjector {

    public static void inject(Object obj) throws Exception {

        // Get all fields of the object
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            // Check whether @Inject annotation is present
            if (field.isAnnotationPresent(Inject.class)) {

                // Get the class name of the field
                String className = field.getType().getName();

                // Load the class using Class.forName()
                Class<?> cls = Class.forName(className);

                // Create an object of that class
                Object dependency = cls.newInstance();

                // Access private field
                field.setAccessible(true);

                // Inject the dependency
                field.set(obj, dependency);
            }
        }
    }
}