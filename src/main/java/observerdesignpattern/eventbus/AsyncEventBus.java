package observerdesignpattern.eventbus;

/*
 * Claire
 * @date  2020/7/26 下午10:52
 *
 */

import java.util.concurrent.Executor;

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
