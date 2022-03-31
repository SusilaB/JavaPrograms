package New_Package;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class Excercise_Class {



    public static void main(String[] args)throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gurup\\OneDrive\\Desktop\\selenium notes\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        driver.get("https://www.google.com");
       Thread.sleep(5000);
        
        //close Fire fox
        driver.close();
       
    }

}