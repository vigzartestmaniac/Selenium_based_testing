package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class systemtestproj1 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement oneway=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[1]/ul[2]/li[2]/label"));
		oneway.click();
		Thread.sleep(2000);
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[2]/input"));
		from.click();
		Thread.sleep(1500);
		from.sendKeys("Kochi, India (COK)");
		Thread.sleep(2000);
		
		WebElement to=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[3]/input"));
		to.click();
		Thread.sleep(1500);
		to.sendKeys("Thiruvananthapuram, India (TRV)");
		Thread.sleep(2000);
		
		WebElement dateleave=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[9]/input"));
		dateleave.click();
		Thread.sleep(1500);
		dateleave.sendKeys("11/03/24");
		Thread.sleep(1500);
		
		//Dropdown
		
		WebElement List=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[1]/select"));
		Select obj=new Select(List);
		obj.selectByIndex(2);
		Thread.sleep(1500);
		
		WebElement List2=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[2]/select"));
		Select obj2=new Select(List2);
		obj2.selectByValue("4");
		Thread.sleep(1500);
		
		WebElement List3=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[11]/div[3]/select"));
		Select obj3=new Select(List3);
		obj3.selectByVisibleText("1 infant");
		Thread.sleep(1500);
		
		WebElement find=driver.findElement(By.xpath("//*[@id=\"build\"]/fieldset[13]/a[2]/i"));
		find.click();
		Thread.sleep(3000);
		System.out.println("Booking successful");
		
		driver.close();
		
		
		
	}

}
