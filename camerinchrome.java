package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class camerinchrome {
		
	public static void main(String[] args)throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement google=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
			google.click();
			google.sendKeys("camerinfolks");
			Thread.sleep(2000);
			
			WebElement search=driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span"));
			search.click();
			Thread.sleep(2000);
			
			WebElement detail=driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
			detail.click();
			Thread.sleep(4000);
			
			
			driver.close();
			
			
			
			
		}

	}

