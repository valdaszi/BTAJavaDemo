package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import lt.baltictalents.p24.demo5.A;

public class Test5 {

    @Test
    public void testSomething1() {

        A a = new A(1, 2);

        assertEquals(1, a.getI1(), 0);
        assertEquals(2, a.getI2(), 0);
        assertEquals(1.5, a.getAvg(), 0);
        assertEquals(1.499999999, a.getAvg(), 0.01);
    }

    @Test
    public void testSomething2() {

        A a = new A(1, 3);

        assertEquals(a.getAvg(), 2, 0);
    }

}
