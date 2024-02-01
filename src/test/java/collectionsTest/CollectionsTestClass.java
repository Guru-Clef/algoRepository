package collectionsTest;

import collection.framework.map.MapImpl;
import collection.framework.map.SortedMapImpl;
import collection.framework.set.SetImpl;
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


  @Test
  public void testHashMap() {
    MapImpl mapImpl = new MapImpl();
    mapImpl.test();
  }

  @Test
  public void testTreeMap_SortedMapInterface() {
    SortedMapImpl sortedMap = new SortedMapImpl();
    sortedMap.test();
  }

  @Test
  public void testHashSet_SetInterface() {
    SetImpl setImpl = new SetImpl();
    setImpl.test();
    setImpl.test2();
  }



}
