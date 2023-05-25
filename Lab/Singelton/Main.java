public class Main {
 public static void main(String[] args) {
     BrowserTab tab1 = new BrowserTab();
     BrowserTab tab2 = new BrowserTab();

     tab1.visitURL("https://www.example1.com");
     tab1.visitURL("https://www.example2.com");
     tab2.visitURL("https://www.example3.com");
     System.out.println();
     BrowserHistory.getInstance().showHistory(); // Output: example1.com, example2.com, example3.com
 }
}
