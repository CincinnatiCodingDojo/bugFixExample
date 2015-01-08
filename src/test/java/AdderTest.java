import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

  @Test
  public void shouldAdd2And3() {
    assertEquals(5, Adder.add(2, 3));
  }

}