package observerdesignpattern;

/*
 * Claire
 * @date  2020/7/25 下午9:56
 *
 */


public class ConcreteObserverTwo implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("observer two want to update message");
    }
}
