package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public void before() {
		System.out.println("*******************");
		System.out.println("Before Method Execution");
	}
	@After
	public void after() {
		
		System.out.println("After Method Execution");
		System.out.println("*********************");
	}

}
