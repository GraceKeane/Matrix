import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Matrix m1 = new Matrix(11);
		Matrix m2 = new Matrix(12); 
		
		
		Matrix actual = m1.Add(m2);
		
		Matrix expected = new Matrix(23);
		
		assertEquals(expected, actual);

	}

	@Test
	public void testSubtract() {
		Matrix m1 = new Matrix(10);
		Matrix m2 = new Matrix(8);
		
		Matrix expected = new Matrix(2);
		
		Matrix actual = m1.Subtract(m2);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testEqualsObject() {		
		Matrix m1 = new Matrix(1);
		Matrix m2 = new Matrix(1);

		assertEquals(m1,m2);
	}

}
