package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mousehoveringproj2 {
	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		
		WebElement hoverfirst=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hoverfirst).build().perform();
		Thread.sleep(1500);
		
		WebElement hflink1=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		hflink1.click();
		hflink1.sendKeys(Keys.ENTER)
		
		
		
//		WebElement hoversecond=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
//		act.moveToElement(hoversecond).build().perform();
//		Thread.sleep(1500);

		
		
		driver.close();
		
		
	}

}
