import java.util.ArrayList;
import java.util.List;

public class DecathlonStore implements Subject {
    private List<Observer> observers;

    public DecathlonStore() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Discount discount) {
        for (Observer observer : observers) {
            observer.update(discount);
        }
    }

    public void announceDiscount(Discount discount) {
        System.out.println("Announcing discount: " + discount.getDescription());
        notifyObservers(discount);
    }
}
