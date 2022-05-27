package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionTest {

  public void queueTest() {

    // esto es una cola - FIFO
    // NO acepta valores nulos

    Queue<Integer> queue = new PriorityQueue<>();
    queue.add(1);
    queue.offer(2);
    queue.add(3);

    System.out.println(queue);

    System.out.println("queue.element() - Devuelve el HEAD de la cola, no lo remueve " + queue.element());
    System.out.println("queue.peek() - Devuelve el HEAD de la cola, no lo remueve " + queue.peek());

    Integer removedElement = queue.poll();

    System.out.println("queue.poll() - Remueve el HEAD y lo devuelve " + removedElement);
    System.out.println(queue);

//    queue.add(null); // NULL POINTER
//    System.out.println(queue);



  }

}
