package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilsTest {

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
	
	//単語が増えても@CsvSourceでまとめて確認できる
	@ParameterizedTest
	@CsvSource({
		"aaa",
	})
	void test(String word) {
		assertEquals(word, StringUtils.toSnakeCase(word));
	}
	
	//ここはほかに書き方がある気がする
	@ParameterizedTest
	@CsvSource({
		"HelloWorld",
	})
	void test2(String word) {
		assertEquals("hello_world", StringUtils.toSnakeCase(word));
	}

	@ParameterizedTest
	@CsvSource({
		"practiceJunit",
	})
	void test3(String word) {
		assertEquals("practice_junit", StringUtils.toSnakeCase(word));
	}
}
