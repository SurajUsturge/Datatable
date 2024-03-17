package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseClass 
{
	
//	DataTable is used to fill the large registeration form in one click 
	
	public static WebDriver driver;
	

@Given("url of page")
public void url_of_page() {
	System.setProperty("webdriver.chrome.driver","E:\\Java Project for github practice\\cucumber_project\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}

@When("user enter valid credentials")
public void user_enter_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
{
	
	List<List<String>> data=dataTable.asLists();
	driver.findElement(By.xpath("//input[@name='username']")).click();
//	first row =>0
//   second column =>1
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(1));

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(1).get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();


}

	
	
	@When("user should login page")
	public void user_should_login_page() throws InterruptedException {
		System.out.println("user logged in successfully");

			}
	
	
}
