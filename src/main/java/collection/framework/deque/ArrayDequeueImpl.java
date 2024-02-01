package collection.framework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueImpl {

  public void test() {

    // es un double ended queue
    // es flexible porque tiene métodos para agregar, remover y obtener
    // Blocking operations. takeFirst, takeLast

    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(1);
    deque.add(2);
    deque.add(3);

    deque.addFirst(0);
    deque.addLast(4);

    boolean isOk = deque.contains(1); // true

    deque.offer(5); // agrega el elemento al final de la cola.




  }

}
