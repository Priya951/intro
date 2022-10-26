package package2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class c4 {
	
	@Test(groups="Two")
	
	public void t4() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSI\\Desktop\\JAVA\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass list box as input to the select object
		// index, value or visible text
		// multiple options can be selected at a time
		// deselection is  possible 
		WebElement ele = ob.findElementById("multiple-select-example");	
		Select s= new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		
		Thread.sleep(3000);
		
		s.deselectByIndex(2);
		
		Thread.sleep(3000);
		
		ob.quit();
		
	}

}
