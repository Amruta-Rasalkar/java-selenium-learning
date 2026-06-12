import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//invoking the browser
		//Chrome - ChromeDriver exten-> Methods close get
		//Firefox - FirefoxDriver -> methods close get (gecko driver for System setProperty )
		//safari - SafariDriver -> methods close get
		//Microsoft Edge - EdgeDriver
		//WebDriver methods + class methods
		// Chromedriver.exe -> Chrome browser
		// step to invoke chrome driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrut\\Downloads\\chromedriver-win64\\chromedriver-win64.exe"); //if new selenium isn't working. 
		WebDriver driver = new ChromeDriver(); //click on red line and import Chrome Driver
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //closes only current tab
		//driver.quit(); //closes current tab + associated tabs which made you open current tab. 
	}

}
