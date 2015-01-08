import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

  @Test
  public void shouldAdd() {
    assertEquals(5, Adder.add(2, 3));
    assertEquals(6, Adder.add(3, 3));
    assertEquals(7, Adder.add(3, 4));
  }
}