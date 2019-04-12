package demojUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		DemoClass ob = new DemoClass();
		int res = ob.addition(50, 26);
		assertEquals(76, res);
	}

}
