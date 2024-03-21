package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class checkbox {
	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	driver.manage().window().maximize();	
	Thread.sleep(2000);
	
	WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
	checkbox.click();
	System.out.println(checkbox.isSelected());
	Thread.sleep(2000);
	
	
	
	List<WebElement>checklist=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<checklist.size();i++)
			
		{	
			checklist.get(i).click();
			Thread.sleep(500);
			System.out.println(checklist.get(i).getAttribute("value"));
		
		}
		
	WebElement radiobox=driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
	radiobox.click();
	Thread.sleep(1000);
		
	List<WebElement>radiolist=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int j=0;j<radiolist.size();j++)
		{
			radiolist.get(j).click();
			Thread.sleep(500);
			System.out.println(radiolist.get(j).getAttribute("value"));
		}
	
	
	driver.close();
	}
}
