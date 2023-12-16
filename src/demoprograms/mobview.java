package demoprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class mobview {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacob\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//creating our first map for deviceName
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy S5");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://app.uniswap.org/swap");
		driver.getTitle();
		

		//navigate to url
		driver.navigate().to("https://app.uniswap.org/nfts");
		
		
		//wait to page load
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		// 1W view of the Trending NFT collections
		driver.findElement(By.xpath("//div[@class='text__TextWrapper-sc-ff9b9e4c-0 Hhsep TrendingCollections__StyledSelectorText-sc-c0c70b1b-5 gtECIt css-p9plib']")).click();
		
		driver.close();
		
	}

}
