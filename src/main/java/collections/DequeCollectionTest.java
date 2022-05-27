package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeCollectionTest {

  public void testDeque() {

    // importa el orden de insersión
    // esto es una doble linked list
    // LinkedList es la opción preferente para ser usado como un STACK, LIFO operations
    //  recuerda que STACK extiende de VECTOR



    Deque<Integer> deque = new LinkedList<>();

//    deque.add(1);
//    deque.addFirst(2);
//    deque.addLast(3);
//    deque.add(null);
//
//    System.out.println("before poll " + deque);
//
//    deque.poll();
//
//    System.out.println("after poll " + deque);
//
//    deque.pop();
//
//    System.out.println("after pop " + deque);

    deque.offer(10);
    deque.offer(11);
    deque.offer(12);

    System.out.println("offer " + deque);

    System.out.println("deque.peek() - devuelve el primer elemento, no lo borra " + deque.peekLast());

    Integer popped = deque.pollLast();

    System.out.println("deque.pollLast() " + deque);

  }


  public static void ArrayDequeTest() {

    Deque<Integer> arrayDeque = new ArrayDeque<>();

    // arrayDeque.





  }

}
