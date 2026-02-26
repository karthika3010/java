class PrinterManager {

    
    private static PrinterManager instance;


    private PrinterManager() {
    }

  
    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

  
    public void print() {
        System.out.println("Printing document...");
    }
}
