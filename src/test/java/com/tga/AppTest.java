package com.tga;
// import junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testfunc1() {
        int f=App.func1(5, 7);
        assertEquals(f, 10);
    }
    @Test
    public void testfunc2() {
      int f=App.func2(5, 7);
        assertEquals(f, 35);
    }
    
        @Test
    public void testfunc3() {
      int f=App.func3(5, 7);
        assertEquals(f, 40);
    }

            @Test
    public void testfun2and3() {
      int f=App.func3(5, 7);
      int k=App.func2(5, 7);
      int sum=k+f;
        assertEquals(sum, 75);
    }
        public void testfun4and5() {
      int f=App.func4(5, 7);
      int k=App.func5(5, 7);
      int sum=k+f;
        assertEquals(sum, 26);
    }

    // @Test
    //     public void testfunc4() {
    //   int f=App.func4(5, 7);
    //     assertEquals(f, 25);
   // }
    //     @Test
    //     public void testfunc5() {
    //   int f=App.func5(5, 7);
    //     assertEquals(f, 1);
    // }

}
