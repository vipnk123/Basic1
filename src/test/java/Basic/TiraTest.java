package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TiraTest {



@Test
	
	public void perfumeTest() {
	
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tirabeauty.com/");
		Assert.assertEquals("Pune", "Mumbai");
		System.out.println("Good Morning");
		
		/*WebElement stf = driver.findElement(By.id("search"));
		stf.sendKeys("perfume");
		stf.sendKeys(Keys.ENTER);*/
	}
}
