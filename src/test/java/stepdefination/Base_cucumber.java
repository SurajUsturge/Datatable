package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Base_cucumber 
{
	public static WebDriver driver;
@Given("url of page")
public void url_of_page() 
{
	System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice\\cucumber_project\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


}

@When("user enter username")
public void user_enter_username() {
	driver.findElement(By.xpath("//input[@name='username']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

}

@When("user enter password")
public void user_enter_password() {
	driver.findElement(By.xpath("//input[@name='password']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

}

@Then("user login successfully")
public void user_login_successfully() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}


}
