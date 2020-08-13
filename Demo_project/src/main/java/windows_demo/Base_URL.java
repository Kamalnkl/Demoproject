package windows_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Base_URL {

	public static WebDriver driver;

//commits

	@Test
	public void initilization() throws InterruptedException  {



		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamal\\Downloads\\chromedriver_83.exe");
		driver = new ChromeDriver();

		driver.get("https://www.pexels.com/photo/vintage-brown-wooden-crank-phone-1222557/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Free Download')]")).click();

	}

}
