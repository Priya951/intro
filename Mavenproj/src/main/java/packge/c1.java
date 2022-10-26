package packge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	
	public void t1 () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSI\\Desktop\\JAVA\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.google.com/");
	}

}
