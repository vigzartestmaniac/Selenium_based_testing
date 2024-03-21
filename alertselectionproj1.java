package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alertselectionproj1 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alertbtn=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		alertbtn.click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		System.out.println("success1");
		
		WebElement alertokcancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertokcancel.click();
		Thread.sleep(1500);
		
		WebElement alertconf1=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alertconf1.click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		System.out.println("acceppt success2");
		
		WebElement alertconf2=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		alertconf2.click();
		Thread.sleep(1500);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1500);
		System.out.println("dismiss success3");
		
		
		
		WebElement promptselect=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		promptselect.click();
		Thread.sleep(1500);
		
		WebElement promptbtn=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptbtn.click();
		Thread.sleep(1500);
		Alert promptobj=driver.switchTo().alert();
		Thread.sleep(1500);
		promptobj.sendKeys("Vignesh");
		Thread.sleep(1500);
		promptobj.accept();
		Thread.sleep(1500);
		System.out.println("Prompt success4");
		Thread.sleep(1500);
		
		WebElement promptbtn2=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		promptbtn2.click();
		Thread.sleep(1500);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1500);
		System.out.println("dismiss success5");
		Thread.sleep(1500);
		
		
		driver.close();
	}
	

}
