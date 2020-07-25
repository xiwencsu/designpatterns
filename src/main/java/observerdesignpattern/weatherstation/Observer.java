package observerdesignpattern.weatherstation;

/*
 * Claire
 * @date  2020/7/25 下午10:33
 *
 */

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
