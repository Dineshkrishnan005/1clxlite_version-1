package object_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECX_Signup_Object 
{
 static WebDriver driver;
	 
	 public ECX_Signup_Object(WebDriver driver)
	 {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
				    
	 }

	@FindBy(partialLinkText = "Signup")
	public static WebElement signupbtn;
	
	@FindBy(xpath = "//input[@id='ecxRadio']")
	public static WebElement ecxradiobtn;
	
	@FindBy(xpath = "//input[@name='name']")
	public static WebElement entername;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	public static WebElement entermail;
	
	@FindBy(xpath = "(//input[@name='password'])[1]")
	public static WebElement enterpwd;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]")
	public static WebElement signupbtn2;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement verifyotp;
	
	
	
	
	
	
	
	
	
	

}
