import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private static BrowserHistory instance;
    private List<String> history;

    private BrowserHistory() {
        history = new ArrayList<>();
    }

    public static BrowserHistory getInstance() {
        if (instance == null) {
            instance = new BrowserHistory();
        }
        return instance;
    }

    public void addURL(String url) {
        history.add(url);
    }

    public void showHistory() {
        for (String url : history) {
            System.out.println(url);
        }
    }
}
