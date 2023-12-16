package demoprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sortNFTvalue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\jacob\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Initialize browser
        WebDriver driver=new ChromeDriver();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;



        // Open Google
        driver.get("https://app.uniswap.org/swap");

        // Maximize browser
        driver.manage().window().maximize();
		
        //wait to page load
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
        
		//navigate to url
		driver.navigate().to("https://app.uniswap.org/nfts");
		
		
		 //This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//sort the values by clicking on volume
		driver.findElement(By.xpath("//span[contains(.,'Volume')]")).click();
		
		
		
		
		
		// //Fetch All the Text from Collection name and Volume
		//List<WebElement> listcollection_ele = driver.findElements(By.xpath("//span[contains(.,'Collection name')]"));
		//System.out.println("/n its working /n");
		
		//List<WebElement> listvolume_ele = driver.findElements(By.xpath("//span[contains(.,'Volume')]"));
		//System.out.println("/n its working too /n");
		
		
		
		
		
		//Use of HashMaop to store Collection names and values from Volume
			//sortUsingJavaCollection(listcollection_ele,listvolume_ele);
			
			}
			
		
				
	

	private static void sortUsingJavaCollection(List<WebElement> listcollection_ele ,List<WebElement> listvolume_ele) {
		// TODO Auto-generated method stub
		String collection_name;
		String volume_val;
		int int_volume_val;
		HashMap<Integer, String> map_final_collections = new HashMap<Integer,String>();
		for(int i=0;i<listcollection_ele.size();i++) {
			collection_name = listcollection_ele.get(i).getText();//Iterate and fetch collection name
			volume_val = listvolume_ele.get(i).getText();//Iterate and fetch volume value
			volume_val = volume_val.replaceAll("[^0-9]", "");//Replace anything will space other than numbers
			int_volume_val = Integer.parseInt(volume_val);//Convert to Integer
			map_final_collections.put(int_volume_val,collection_name);//Add collection name and volume value in HashMap
		}
 

		//One way is to fetch all values of the hashMap and then save it in the ArrayList
		//Then using Collections class in java, sort it. this we can easily get highest and lowest
		
		//Get all the keys from Hash Map
		Set<Integer> allkeys = map_final_collections.keySet();
		ArrayList<Integer> array_volume_val = new ArrayList<Integer>(allkeys);
		
		//Sort the volume values in Array List using Collections class
		
		//Collections.sort(array_volume_val);
		
		//this will sort in ascending order
		Collections.reverse(array_volume_val);
		
		//Highest volume is
		int highvolume = array_volume_val.get(array_volume_val.size()-1);
		
	}

}
