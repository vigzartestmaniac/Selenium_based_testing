package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class copypasteproj1 {
	
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/customer-onboarding-form/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.click();
		Thread.sleep(1500);
		fname.sendKeys("Viignesh");
		Thread.sleep(2000);
		
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.click();
		Thread.sleep(1500);
		lname.sendKeys("Vinod");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		email.click();
		Thread.sleep(1500);
		email.sendKeys("www.abc@gmail.com");
		Thread.sleep(2000);
		
		WebElement passwrd=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		passwrd.click();
		Thread.sleep(1500);
		passwrd.sendKeys("Abc@1234");
		Thread.sleep(2000);
		
		WebElement address1=driver.findElement(By.xpath("//*[@id=\"input_box_1665571284\"]"));
		address1.click();
		Thread.sleep(1500);
		address1.sendKeys("XYZ,ABCHOUSE,USA,MAZINE VILLA,998860");
		Thread.sleep(2000);
		
		address1.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1500);
		address1.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(1500);
		
		WebElement address2=driver.findElement(By.xpath("//*[@id=\"input_box_1665571334546\"]"));
		address2.click();
		Thread.sleep(1500);
		address2.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(1500);
		
		
		driver.close();
		
	}

}
