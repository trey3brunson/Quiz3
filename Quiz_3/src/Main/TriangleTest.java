package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

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
	public void test() {
		Triangle triangle1 = new Triangle();
		double testTriangleArea = triangle1.getArea();
		assertEquals(0.5, testTriangleArea, 0);
		
		Triangle triangle2 = new Triangle();
		double testTrianglePermineter = triangle2.getPerimeter();
		assertEquals(3,testTriangleArea,4);
		
	}

}
