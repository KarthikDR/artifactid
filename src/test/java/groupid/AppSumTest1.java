package groupid;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppSumTest1 {

	@Test
	public void test() {
		System.out.println(AppSum.sum(10, 40));
		
		assertEquals(50, AppSum.sum(10, 40));
		assertEquals(60, AppSum.sum(20, 40));
	}

}
