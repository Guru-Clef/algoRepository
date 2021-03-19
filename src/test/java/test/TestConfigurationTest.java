package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Este es un test para practicar con JUnit 5")
public class TestConfigurationTest {

  @Test
  @DisplayName("Este es un test de prueba")
  void testConfiguration() {

    TestConfiguration testConfiguration = new TestConfiguration();
    Assertions.assertTrue(testConfiguration.thisIsATest("Hola Test"));
  }

}
