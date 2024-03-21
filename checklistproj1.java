package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checklistproj1 {
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(1800);
		
		List<WebElement> checklist=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<checklist.size();i++) {
			
			checklist.get(i).click();
			Thread.sleep(1500);
			System.out.println(checklist.get(i).getAttribute("value"));
			
		}
		
		
		driver.close();
		
	}
}
