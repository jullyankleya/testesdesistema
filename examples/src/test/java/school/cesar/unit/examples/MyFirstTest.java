package school.cesar.unit.examples;

import org.junit.jupiter.api.*;

public class MyFirstTest {

    private boolean isTrue = false;

    @AfterEach
    public  void tearDown(){
        isTrue = false;
    }

    @Test
    public void isTrueInitializedAsFalse(){
        Assertions.assertFalse(isTrue);
    }

    @Test
    public void isTrueInitializedAsTrue(){
        isTrue = true;
        Assertions.assertTrue(isTrue);
    }

    @Test
    public void assertEqualsTest(){
        Assertions.assertEquals(4, 2 + 2);
    }
}
