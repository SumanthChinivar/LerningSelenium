package crossBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningCrossBrowser3 {
	@Test
	@Parameters("flower")
	public void flower1(String flower) {
		System.out.println(flower);
	}
}
