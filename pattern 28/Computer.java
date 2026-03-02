public class Computer
{
    private final String CPU;
    private final int RAM;

 
    private final int HDD;
    private final boolean graphics;

  
    private Computer(Builder builder)
    {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.graphics = builder.graphics;
    }

   
    public String getCPU()
    {
        return CPU;
    }

    public int getRAM()
    {
        return RAM;
    }

    public int getHDD()
    {
        return HDD;
    }

    public boolean hasGraphics()
    {
        return graphics;
    }

   
    public static class Builder
    {
        
        private final String CPU;
        private final int RAM;

      
        private int HDD = 0;
        private boolean graphics = false;

        
        public Builder(String CPU, int RAM)
        {
            this.CPU = CPU;
            this.RAM = RAM;
        }

       
        public Builder setHDD(int HDD)
        {
            this.HDD = HDD;
            return this;
        }

        public Builder setGraphics(boolean graphics)
        {
            this.graphics = graphics;
            return this;
        }

        
        public Computer build()
        {
            return new Computer(this);
        }
    }
}