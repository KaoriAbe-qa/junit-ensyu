package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.tutorial.ex01.e01.StringUtils;

class NumberUtilsTest {

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

	//�P�ꂪ�����Ă�@CsvSource�ł܂Ƃ߂Ċm�F�ł���
	@ParameterizedTest
	@CsvSource({
		"10, true"
	})
	void test1(int num) {
		assertTrue(NumberUtils.isEven(num));
	}
	
	//�P�ꂪ�����Ă�@CsvSource�ł܂Ƃ߂Ċm�F�ł���
	@ParameterizedTest
	@CsvSource({
		"7, false"
	})
	void test2(int num) {
		assertFalse(NumberUtils.isEven(num));
	}

}
