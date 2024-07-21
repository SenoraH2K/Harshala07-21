package www.automatiom.IIT;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class RediffExamples {
		static WebDriver driver;

		public static void main(String[] args) 
		{

		
	//Access the Chrome Browser
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().minimize();

			//Enter the url : https://money.rediff.com/gainers
			driver.get("https://money.rediff.com/gainers");

			String stockArray[]= {"ABC India Ltd.","MOIL","Elixir Capital","AAAA","XYZ","Tata", "Coral"};
			
			for(int i=0;i<stockArray.length;i++)
			{
				
				 fetchStockDetails(stockArray[i]);
			}

			driver.quit(); 
		
		}
		public static void fetchStockDetails(String stockName)
		{
			//if stock is available 
			System.out.println("#########################Printing the stock Details for :::::###################" + stockName);
			try {

				if(driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]")).isDisplayed())
				{
					//Fetch the stock Details:MOIL
					String group = driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]/parent::td/following-sibling::td[1]")).getText();
					String prevClose = driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]/parent::td/following-sibling::td[2]")).getText();
					String currClose= driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]/parent::td/following-sibling::td[3]")).getText();
					String percentageChange = driver.findElement(By.xpath("//a[contains(text(),'"+stockName+"')]/parent::td/following-sibling::td[4]")).getText();

					System.out.println("Group Value::::" + group);
					System.out.println("Prev Close Value::::" + prevClose);
					System.out.println("Curr Close Value::::" + currClose);
					System.out.println("Percentage Change Value::::" + percentageChange);
				}
				
			}
			catch(Exception e)
			{
				System.out.println("The " +stockName+ " is not displayed in Gainers list" );
				}
		
		}
		
		
	}
		
		


