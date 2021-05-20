package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

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
		"16"
		  //エラー確認用の10も
	})
	void test(int num) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		List<String> result = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz",
				"Buzz","11","Fizz","13","14","FizzBuzz","16");
		//assertEquals(result, fizzBuzz.createFizzBuzzList(num));
		assertIterableEquals(result, fizzBuzz.createFizzBuzzList(num));
	}

}
