package demoprograms;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VerifyNavBar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacob\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//creating our first map for deviceName
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy S5");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://app.uniswap.org/swap");
		driver.getTitle();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@class,'_1klryar0 rgw6ez44f rgw6ez44t rgw6ez46x rgw6ez3x')]"));

	    for (WebElement w : allLinks)
	    {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        w.click();
	        if (driver.findElement(By.xpath("//div[contains(@class,'_1klryar0 rgw6ez44f rgw6ez44t rgw6ez46x rgw6ez3x')]")).isDisplayed())
	        {
	            System.out.println("Link:"+w.getText()+"is working");
	        }
	        else
	        {
	            System.out.println("Link:"+w.getText()+"is not working");
	        }
	        //driver.navigate().back();//To come back to the Home screen

		
	}
	}
}
