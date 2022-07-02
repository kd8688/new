package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
	
	@FindBy(xpath = "//input[@name='email']")private WebElement mailID;
	@FindBy(xpath = "//input[@id='pass']")private WebElement password;
	@FindBy(xpath = "//button[@name='login']")private WebElement login;
	
	public FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMail(String id)
	{
		mailID.sendKeys(id);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	
	

}
