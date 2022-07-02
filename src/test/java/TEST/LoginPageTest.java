package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.FBLoginPage;
import UTILITY.Parameterisation;
import UTILITY.Screenshot;

@Listeners(TestListners.class)

public class LoginPageTest extends TestListners {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver = Browser.OpenBrowser();
	}
	
	@AfterMethod
	public void screenshot() throws IOException
	{
		Screenshot.TakeScreenshot(driver, "Login");
	}
	
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		FBLoginPage fbloginpageTest = new FBLoginPage(driver);
		String userid = Parameterisation.getData("Credentials", 0, 1);
		String passsword = Parameterisation.getData("Credentials", 1, 1);
		fbloginpageTest.enterMail(userid);
		fbloginpageTest.password(passsword);
		fbloginpageTest.clickonlogin();	
	}
	
	@Test
	public void t1()
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	
	@Test
	public void t2()
	{
		System.out.println("t2");
	}
	

}
