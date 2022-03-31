package New_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebSearch {
	WebDriver driver;
	
	public void launchbrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gurup\\OneDrive\\Desktop\\selenium notes\\Softwares\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
   		
	}
	
	public void searchproduct() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("JBL speakers");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Daily Deals")).click();
	}
	public void Navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("The title of the Browser is" +driver.getTitle());
	}
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebSearch obj = new WebSearch();
		obj.launchbrowser();
		obj.searchproduct();
		obj.Navigate();
		obj.closeBrowser();

	}

}
