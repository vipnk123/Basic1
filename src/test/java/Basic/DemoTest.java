package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	
	public void launchTest() {
	
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	
@Test
	
	public void perfumeTest() {
	
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tirabeauty.com/");
		
		WebElement stf = driver.findElement(By.id("search"));
		stf.sendKeys("perfume");
		stf.sendKeys(Keys.ENTER);
	}

}
