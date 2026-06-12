import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait - 5 seconds timeout 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //ID
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //name
		driver.findElement(By.className("signInBtn")).click(); //className
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //cssSelector
		driver.findElement(By.linkText("Forgot your password?")).click(); //linkText
		//Thread.sleep(1000);   //if you don't get end green statement result. 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); //XPath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
	}

}
