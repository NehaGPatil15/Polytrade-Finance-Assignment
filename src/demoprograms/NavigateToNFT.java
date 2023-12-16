package demoprograms;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateToNFT {

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
		
		driver.close();

	}

}
