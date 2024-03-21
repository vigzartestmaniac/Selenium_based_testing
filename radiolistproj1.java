package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class radiolistproj1 {
	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcreate%2F%3Fref_type%3Dregistration_form&locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> radiolist=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radiolist.size();i++)
		{
			radiolist.get(i).click();
			Thread.sleep(1000);
			System.out.println(radiolist.get(i).getAttribute("value"));
			
		}
		driver.close();
	}
	
}
