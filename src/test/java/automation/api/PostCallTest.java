package automation.api;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostCallTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("before method");
	}
	
	
	@Test
	public void post_api_test() {
		System.out.println("main test");
	}

}
