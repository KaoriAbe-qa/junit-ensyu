package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RangeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource({
		"false, -0.1, 0.0, 10.5",
		"true, 0.0, 0.0, 10.5",
		"true, 10.5, 0.0, 10.5",
		"false, 10.6, 0.0, 10.5",
		
		"false, -5.2, -5.1, 5.1",
		"true, -5.1, -5.1, 5.1",
		"true, -0.1, -5.1, 5.1",
		"false, 5.2, -5.1, 5.1"
		
		//ÉGÉâÅ[óp
	})
	void test1(boolean ans, double num, double min, double max) {
		Range range = new Range(min, max);
		assertEquals(ans, range.contains(num));
	}

}
