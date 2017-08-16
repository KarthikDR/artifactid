package groupid;

import junit.framework.TestCase;

public class AppSumTest extends TestCase {
	
	
    public void addToNumbers() {
        
        // assert statements
        assertEquals("10 + 40 equals to ", 50, AppSum.sum(10, 40));
        assertEquals("10.02 + 40.05 equals to ", 15, AppSum.sum(5, 10));
    }

	
}
