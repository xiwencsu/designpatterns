package observerdesignpattern;

/*
 * Claire
 * @date  2020/7/25 下午9:56
 *
 */


public class ConcreteObserverOne implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("observer one want to update message");
    }
}
