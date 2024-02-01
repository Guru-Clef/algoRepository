package collection.framework.deque;

import java.util.LinkedList;

public class LinkedListImpl {

    public void linkedListUse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.addLast(0);
        list.addFirst(4);

        list.offerFirst(10); // inserta el elemento especificado al frente de esta lista
        list.offerLast(11); // inserta el elemento especificado al final de la lista
        list.offer(12); // inserta el elemento al final.

        int first = list.peek(); // devuelve, pero NO REMUEVE, el primer elemento de la lista.
        int first2 = list.peekFirst(); // lo mismo que el de arriba
        int last = list.peekLast(); // devuelve el último.


    }





}
