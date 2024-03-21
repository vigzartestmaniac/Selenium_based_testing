package selenium_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class brower_initialization {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwvi\\OneDrive\\Desktop\\selenium drivers\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user=driver.findElement(By.id("user-name"));
		user.click();
		user.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.click();
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
		
		WebElement prodselect=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		prodselect.click();
		Thread.sleep(2000);
		
		WebElement addcart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addcart.click();
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		WebElement checkinfofname=driver.findElement(By.id("first-name"));
		checkinfofname.click();
		checkinfofname.sendKeys("vignesh");
		Thread.sleep(2000);
		
		WebElement checkinfolname=driver.findElement(By.id("last-name"));
		checkinfolname.click();
		checkinfolname.sendKeys("vs");
		Thread.sleep(2000);
		
		WebElement checkinfozip=driver.findElement(By.id("postal-code"));
		checkinfozip.click();
		checkinfozip.sendKeys("695028");
		Thread.sleep(2000);
		
		WebElement checkinfocont=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		checkinfocont.click();
		Thread.sleep(2000);
		
		WebElement finish=driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		finish.click();
		Thread.sleep(2000);
		
		WebElement backhome=driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backhome.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("user-name")).click();
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		 Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//		 Thread.sleep(2000);
//		driver.findElement(By.name("login-button")).click(); 
	driver.close();
	}

}
