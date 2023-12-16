package demo_Basictrns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUniswap {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\jacob\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Initialize browser
        WebDriver driver=new ChromeDriver();


        // Open URL
        driver.get("https://app.uniswap.org/swap");

        // Maximize browser
        driver.manage().window().maximize();
        
        driver.close();

	}

}
