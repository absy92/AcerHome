package AV1.AV1;

import junit.framework.TestCase;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;


public class CalcyTest extends TestCase 
{
	
	  private Calcy classUnderTest;

	  
	  public void setUp() throws Exception {
	    this.classUnderTest = new Calcy();
	  }

	  
	  public void tearDown() throws Exception {
	    classUnderTest = null;
	  }

	  
	  public void testAdd_positiveNumbers_shouldReturnResult() {
	    assertEquals("add", 7, classUnderTest.add(3, 4));
	  }

	 // @Test(expected = IllegalArgumentException.class)
	  public void testAdd_negativeNumbers_shouldThrowException() {
	    classUnderTest.add(-3, -4);
	  }

	  //@Test
	  public void testSubstract() {
	    assertEquals("substract", 2, classUnderTest.subtract(5, 3));
	  }

	  //@Test
	  public void testMultiply() {
	    assertEquals("multiply", 56, classUnderTest.multiply(7, 8));
	  }


}

