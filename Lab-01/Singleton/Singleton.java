public class Singleton {
    // Static variable that hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example methods to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello this is a message from Singleton!");
    }

    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton singleton = Singleton.getInstance();

        // Call a method on the instance
        singleton.showMessage();
    }
}