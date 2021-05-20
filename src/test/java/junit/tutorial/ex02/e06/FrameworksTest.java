package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

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
		"true, GlassFish, Oracle",
		"true, GlassFish, DB2",
		"true, GlassFish, PostgreSQL",
		"true, GlassFish, MySQL",
		"false, JBoss, Oracle",
		"true, JBoss, DB2",
		"true, JBoss, PostgreSQL",
		"false, JBoss, MySQL",
		"false, Tomcat, Oracle",
		"false, Tomcat, DB2",
		"false, Tomcat, PostgreSQL",
		"true, Tomcat, MySQL"
	})
	void test(boolean result, ApplicationServer appServer, Database db) {
		assertEquals(result, Frameworks.isSupport(appServer, db));
	}

}
