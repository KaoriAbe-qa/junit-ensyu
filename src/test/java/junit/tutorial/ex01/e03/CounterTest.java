package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e01.StringUtils;

class CounterTest {

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

	@Test
	void test1() {
		Counter result = new Counter();
		int ans = 1;
		for(int i = 0 ; i < 1; i++) {
			ans = result.increment();	
		}

		assertEquals(1, ans);
	}
	
	@Test
	void test2() {
		Counter result = new Counter();
		int ans = 1;
		for(int i = 0 ; i <= 1; i++) {
			ans = result.increment();	
		}

		assertEquals(2, ans);
	}
	
	@Test
	void test3() {
		Counter result = new Counter();
		int ans = 1;
		for(int i = 0 ; i <= 50; i++) {
			ans = result.increment();	
		}

		assertEquals(51, ans);
	}

}
