package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class doubleclickproj1 {
	public  static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		act.doubleClick(doubleclick).build().perform();
		Thread.sleep(1500);
		
		driver.close();
		
	}

}
