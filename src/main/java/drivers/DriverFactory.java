package drivers;

import browsers.ChromeBrowser;
import browsers.FirefoxBrowser;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    private Supplier<DriverManger> chrome = () -> new ChromeBrowser();
    private Supplier<DriverManger> firefox = () -> new FirefoxBrowser();
    private Map<String, Supplier<DriverManger>> browserMap = new HashMap<>();

    private void addBrowsers() {
        browserMap.put("firefox", firefox);
        browserMap.put("chrome", chrome);
    }

    public DriverManger get(String browser) {
        addBrowsers();
        return browserMap.get(browser.toLowerCase()).get();
    }
}
