import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomDetailGeneratorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	// Test formula for calculating area.
	@Test
	void test0() {
		double length = 0.0;
		double width = 0.0;
		int expected = 0;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		double length = 1.1;
		double width = 1.1;
		int expected = 1;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		double length = 2.22;
		double width = 2.22;
		int expected = 4;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		double length = 33.33;
		double width = 33.33;
		int expected = 1110;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		double length = 444.444;
		double width = 444.444;
		int expected = 197530;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		double length = 555.5555;
		double width = 555.5555;
		int expected = 308641;
		int actual = RoomDetailGenerator.calculateArea(length, width);
		assertEquals(expected, actual);
	}
	
	// Test formula for calculating perimeter.
	@Test
	void test6() {
		double length = 0.0;
		double width = 0.0;
		int expected = 0;
		int actual = RoomDetailGenerator.calculatePerimeter(length, width);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		double length = 1.1;
		double width = 1.1;
		int expected = 2;
		int actual = RoomDetailGenerator.calculatePerimeter(length, width);
		assertEquals(expected, actual);
	}
}
