public class BrowserTab {
 private BrowserHistory history;

 public BrowserTab() {
     this.history = BrowserHistory.getInstance();
 }

 public void visitURL(String url) {
     history.addURL(url);
 }
}
