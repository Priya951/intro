package package2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="Two")
	
	public void t3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSI\\Desktop\\JAVA\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		ob.findElementByName("email").sendKeys("priyaranaa1995@gmail.com");
		ob.findElementById("pass").sendKeys("Qweasd@123");
		ob.findElementByName("login").click();
		Thread.sleep(3000);
		ob.quit();
	}

}
