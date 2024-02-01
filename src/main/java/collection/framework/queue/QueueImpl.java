package collection.framework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

  public void test() {
    Queue<Integer> queue = new PriorityQueue<>();

    queue.add(1);
    queue.add(2);
    queue.add(3);

    int val = queue.peek(); // devuelve pero no elimina, el ultimo elemento de la lista.




  }

}
