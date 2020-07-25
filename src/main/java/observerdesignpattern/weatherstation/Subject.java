package observerdesignpattern.weatherstation;

/*
 * Claire
 * @date  2020/7/25 下午10:30
 *
 */


public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    /**
     * notify all the observer when the topic changed.
     */
    void notifyObserver();
}
