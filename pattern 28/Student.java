class Student
{
    // Required fields
    private final int id;
    private final String name;

    // Optional fields
    private final String email;
    private final String phone;
    private final String address;

    // Private constructor (only Builder can call)
    private Student(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters only (immutable)
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAddress()
    {
        return address;
    }

    // 🔹 Builder Class
    public static class Builder
    {
        // Required
        private final int id;
        private final String name;

        // Optional (default null)
        private String email;
        private String phone;
        private String address;

        // Builder constructor for required fields
        public Builder(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        // Optional fields (method chaining)
        public Builder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        // Build method
        public Student build()
        {
            return new Student(this);
        }
    }
}