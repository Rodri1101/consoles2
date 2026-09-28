import java.util.Scanner;

public class Main {
    public static void main(String[] eloquence) {
        Scanner input = new Scanner(System.in);

        // Displaying menu exactly as shown in the screenshot prompt
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH\n");

        int choice = input.nextInt();
        input.nextLine(); // Clear the buffer newline character

        String consoleType = "";
        switch (choice) {
            case 1: consoleType = "PS5"; break;
            case 2: consoleType = "XBOX"; break;
            case 3: consoleType = "SWITCH"; break;
            default: consoleType = "Unknown"; break;
        }

        System.out.print("Enter the store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = input.nextInt();

        // Instantiate the concrete object using polymorphism
        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);

        // Execute the reporting action
        report.displayReport();

        input.close();
    }
}
