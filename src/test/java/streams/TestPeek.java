package streams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Este es un test para practicar con JUnit 5")
public class TestPeek {

  @Test
  @DisplayName("Este es un test de prueba")
  void peekStreamTest() {

    Peek testPeek = new Peek();
    testPeek.peekTest();


  }

}
