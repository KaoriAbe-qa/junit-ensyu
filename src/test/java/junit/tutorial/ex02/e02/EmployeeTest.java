package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EmployeeTest {

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
		"Ichiro, Tanaka, ichiro@example.com"
		//�G���[�m�F�p
	})
	void test(String firstName, String lastName, String email) {
		Employee employee = new Employee();
		
		//List<String> empList = Arrays.asList(firstName, lastName, email);
		
		//�e�L�X�g�̓ǂݍ���
		InputStream input = getClass().getResourceAsStream("Employee.txt");
			
		//InputStream input��load���\�b�h�̈����ɂ���
		List<Employee> list = new ArrayList<>();
		list = employee.load(input);
		Employee ans = list.get(0);
		
		assertEquals(firstName, ans.getFirstName());
		assertEquals(lastName,ans.getLastName());
		assertEquals(email, ans.getEmail());
		
		//List���Ɣ�r�����
		//assertIterableEquals(empList, list);
		
		//�Ō�ɕ���H�H
		try {
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

}
