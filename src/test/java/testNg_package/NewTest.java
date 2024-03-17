package testNg_package;

import org.testng.annotations.Test;

public class NewTest extends Base_class
{
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username="Admin";
	String password="admin123";
			
	
  @Test
  public void case1() 
  {
	  launchapp(url);
	  username(username);
	  password(password);
	  loginBtn();
	  
  }
}
