package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class clickandholdproj1 {
	
	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(1500);
		
		WebElement clickandhold=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(clickandhold).build().perform();
		Thread.sleep(2000);
		
		driver.close();
}
}
