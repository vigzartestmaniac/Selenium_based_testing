package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class rightclickproj1 {
	
	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		
		WebElement rightclick=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a"));
		act.contextClick(rightclick).build().perform();
		Thread.sleep(1500);
		
		WebElement shiftcaps=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		act.moveToElement(shiftcaps).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
		Thread.sleep(1500);
		
		driver.close();
	}

}
