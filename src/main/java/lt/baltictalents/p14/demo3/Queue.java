package lt.baltictalents.p14.demo3;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> q = new ArrayList<>();

    public void push(T element) {
        q.add(element);
    }

    public T pull() {
        if (q.size() > 0) {
            T element = q.get(0);
            q.remove(0);
            return element;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Queue{" + q + '}';
    }
}
