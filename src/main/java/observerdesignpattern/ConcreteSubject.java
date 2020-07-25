package observerdesignpattern;

/*
 * Claire
 * @date  2020/7/25 下午9:50
 *
 */


import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers =new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Message message) {
     for (Observer observer:observers){
         observer.update(message);
     }

    }
}
