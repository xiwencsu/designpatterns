package observerdesignpattern;

/*
 * Claire
 * @date  2020/7/25 下午9:41
 *
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Message message);
}

