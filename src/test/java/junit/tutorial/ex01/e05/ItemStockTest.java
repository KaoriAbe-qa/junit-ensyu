package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ItemStockTest {

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

	//初期状態でitem1というitemがあるか探す
	@ParameterizedTest
	@CsvSource({
		"0, item1, 100" 
	})
	void test1(int ans, String name, int price) {
		ItemStock itemstock = new ItemStock();
		Item item = new Item(name, price);
		
		assertEquals(ans, itemstock.getNum(item));
	}
	
	//初期状態でitem1というitemがあるか探す
	@ParameterizedTest
	@CsvSource({
		"1, item1, 100" 
	})
	void test2(int ans, String name, int price) {
		ItemStock itemstock = new ItemStock();
		Item item = new Item(name, price);
		//ここで追加しているので1になる
		itemstock.add(item);
		assertEquals(ans, itemstock.getNum(item));
	}
	
	//itemが追加された状態で同じオブジェクトをaddする
	@ParameterizedTest
	@CsvSource({
		"2, item1, 100" 
	})
	void test3(int ans, String name, int price) {
		ItemStock itemstock = new ItemStock();
		Item item = new Item(name, price);
		itemstock.add(item);
		itemstock.add(item);
		assertEquals(ans, itemstock.getNum(item));
	}
	
	//itemが追加された状態で異なるオブジェクトをaddする
	@ParameterizedTest
	@CsvSource({
		"1, item1, 100" ,
		"1, item2, 100" //異なるオブジェクトを入れても期待値1
	})
	void test4(int ans, String name, int price) {
		ItemStock itemstock = new ItemStock();
		Item item = new Item(name, price);
		itemstock.add(item);
		assertEquals(ans, itemstock.getNum(item));
	}

}
