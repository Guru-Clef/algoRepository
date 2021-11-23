package interview.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test interview 1 - no recuerdo que empresa me preguntó esto")
public class TestInterview1 {

  @Test
  @DisplayName("test de cadena")
  void wordParserTest() {

    Interview1 interview1 = new Interview1();
    String result = interview1
        .wordParser("Creativity is thinking-up new things. Innovation is doing new things!");
    Assertions.assertEquals("C6y is t4g-up n1w t4s. I6n is d3g n1w t4s!", result);


  }


}
