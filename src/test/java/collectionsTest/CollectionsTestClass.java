package collectionsTest;

import collections.DequeCollectionTest;
import collections.QueueCollectionTest;
import org.junit.jupiter.api.Test;

public class CollectionsTestClass {

  @Test
  public void testDeque() {
    DequeCollectionTest testDeque = new DequeCollectionTest();
    testDeque.testDeque();
  }

  @Test
  public void testQueue() {
    QueueCollectionTest queue = new QueueCollectionTest();
    queue.queueTest();
  }



}
