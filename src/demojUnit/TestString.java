package demojUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestString {

	@Test
	void test() {
		DemoClass ob = new DemoClass();
		String res = ob.concatenation("Testing", " with JUnit");
		assertEquals("Testing with JUnit", res);
	}

}
