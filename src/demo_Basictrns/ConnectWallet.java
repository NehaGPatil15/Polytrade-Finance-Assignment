package demo_Basictrns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConnectWallet {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\jacob\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Initialize browser
        WebDriver driver=new ChromeDriver();


        // Open URL
        driver.get("https://app.uniswap.org/swap");
        
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        
        // Maximize browser
        driver.manage().window().maximize();
        
        //select value from dropdown
        Select drp = new Select(driver.findElement(By.xpath("//button[contains(.,'ETH')]")));
        drp.selectByVisibleText("Polygon");
        
        WebElement button = driver.findElement(By.xpath("//div[@class='Button__ButtonOverlay-sc-983e32f-0 dzDkQd']"));
        button.click();
        
        //select MetaMask after clicking on Connect
        driver.findElement(By.xpath("//div[contains(.,'Install MetaMask')]")).click();
        
        driver.close();
        

	}

}
