class ConsoleSales extends AbstractConsole implements IShowReport {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void processSalesData() {
    }

    @Override
    public void displayReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + consoleType);
        System.out.println("STORE: " + storeName);
        System.out.println("TOTAL SALES: " + totalSales);
    }
}
