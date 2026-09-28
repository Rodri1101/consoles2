public abstract class AbstractConsole {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    public AbstractConsole(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public abstract void processSalesData();
}
