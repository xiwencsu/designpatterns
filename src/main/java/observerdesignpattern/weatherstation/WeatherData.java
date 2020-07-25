package observerdesignpattern.weatherstation;

/*
 * Claire
 * @date  2020/7/25 下午10:38
 *
 */


import java.util.ArrayList;


public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i=observers.indexOf(observer);
        if (i>0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }

}
