import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class MatrixParamTest {
	
	// Variables
	private int addMatrix1;
	private int addMatrix2;
	private int addExpectedMatrix;
	private int SubtractMatrix1;
	private int SubtractMatrix2;
	private int SubtractExpectedMatrix;
	private int equalsMatrix1;
	private int equalsMatrix;
	
	// Constructor
	public MatrixParamTest(int addMatrix1, int addMatrix2, int addExpectedMatrix, int subtractMatrix1,
			int subtractMatrix2, int subtractExpectedMatrix, int equalsMatrix1) {
		super();
		this.addMatrix1 = addMatrix1;
		this.addMatrix2 = addMatrix2;
		this.addExpectedMatrix = addExpectedMatrix;
		SubtractMatrix1 = subtractMatrix1;
		SubtractMatrix2 = subtractMatrix2;
		SubtractExpectedMatrix = subtractExpectedMatrix;
		this.equalsMatrix1 = equalsMatrix1;
	}

	// Create test data 
	@Parameters
	public static Collection<Object[]>getData()
	{
		Object[][] data = new Object[2][7];
		
		data[0][0] = 11;
		data[0][1] = 13;
		data[0][2] = 24;
		data[0][3] = 8;
		data[0][4] = 4;
		data[0][5] = 4;
		data[0][6] = 6;
		
		data[1][0] = 5;
		data[1][1] = 12;
		data[1][2] = 17;
		data[1][3] = 4;
		data[1][4] = 6;
		data[1][5] = -2;
		data[1][6] = -3;
		
		return Arrays.asList(data);
	}
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
		Matrix m1 = new Matrix(this.addMatrix1);
		Matrix m2 = new Matrix(this.addMatrix2);
		Matrix expected = new Matrix(this.addExpectedMatrix);
		
		Matrix actual = m1.Add(m2);
		
		assertEquals(expected, actual);
	
	}

	@Test
	public void testSubtract() {
		Matrix m1 = new Matrix(this.SubtractMatrix1);
		Matrix m2 = new Matrix(this.SubtractMatrix2);
		Matrix expected = new Matrix(this.SubtractExpectedMatrix);
		
		Matrix actual = m1.Subtract(m2);
		
		assertEquals(expected, actual);

	}

	@Test
	public void testEqualsObject() {
		Matrix m1 = new Matrix(this.equalsMatrix);
		Matrix m2 = new Matrix(this.equalsMatrix);
		
		assertEquals(m1,m2);
		
	}

}
