package mavenTest;

import static org.junit.Assert.assertEquals;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

 /* @Test(expected = IllegalArgumentException.class)
  public void testExceptionIsThrown() {
    Calc tester = new Calc();
    tester.multiply(1000, 5);
    
  }*/

  @Test
  public void testMultiply() {
    Calc tester = new Calc();
    								//expected output, actual output
    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
  }
  
  @Test
  public void testDivide() {
	  
	  Calc tester = new Calc();
	  assertEquals("10 / 5 must be 2", 2, tester.divide(10, 5));
  }
  
  @Test 
  public void testAdd() {
	  
	  Calc tester = new Calc();
	  assertEquals("10 + 5 must be 15", 15, tester.add(10, 5));
  }
  
  @Test 
  public void testSubtract() {
	  
	  Calc tester = new Calc();
	  assertEquals("10 - 5 must be 5", 5, tester.subtract(10, 5));
  }
}