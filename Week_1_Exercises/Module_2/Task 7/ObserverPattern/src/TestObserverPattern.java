public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile1");
        Observer webApp = new WebApp("Web1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setPrice(100.00);
        stockMarket.setPrice(105.50);
        stockMarket.removeObserver(mobileApp);
        stockMarket.setPrice(110.75);
    }
}
