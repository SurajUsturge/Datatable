package testNg_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base_class 
{
	public static WebDriver driver;
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice\\cucumber_project\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void username(String username)
	{
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}
	
	public void password(String password)
	{
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	
public void loginBtn()
{
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}


}


