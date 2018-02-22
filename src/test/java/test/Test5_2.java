package test;

import lt.baltictalents.p24.demo5.A;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test5_2 {

    @Test
    public void testSomething() {

        A a = new A(1, 2);

        assertEquals(1, a.getI1(), 0);
        assertEquals(2, a.getI2(), 0);
        assertEquals(1.5, a.getAvg(), 0);
    }
}
