package object_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECX_Edit_profile_Object 
{
	 static WebDriver driver;
	 
	 public ECX_Edit_profile_Object(WebDriver driver)
	 {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
				    
	 }


	@FindBy(partialLinkText = "Signup")
	public static WebElement signupbtn;
	
	@FindBy(xpath = "(//a[@id='signIn'])[1]")
	public static WebElement signinbtn;
	
	@FindBy(xpath = "//input[@id='loginEcxRadio']")
	public static WebElement radiobtn;
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement entermail;
	
	@FindBy(xpath = "//input[@id='signin_password']")
    public static WebElement enterpwd;
	
	@FindBy(xpath = "//input[@id='exampleCheck1']")
	public static WebElement rememberme;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
    public static WebElement submitbtn;
	
	@FindBy(xpath = "//i[@class='fa-solid fa-bars-staggered navbar-toggler main-color3 fs-2']")
	public static WebElement menubar;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[1]")
	public static WebElement myprofile;
	
	@FindBy(xpath = "//input[@class=' w-100 border border-less p-2 ']")
	public static WebElement name;
	
	@FindBy(xpath = "//input[@id='user_mobile']")
	public static WebElement mobilenum;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public static WebElement update1;
	
	@FindBy(xpath = "//input[@name='old_password']")
	public static WebElement oldpwd;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement newpwd;
	
	@FindBy(xpath = "//input[@name='password_confirmation']")
	public static WebElement verifypwd;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement update2;
	
	@FindBy(xpath = "//span[@title='Select']")
	public static WebElement selectcountry;
	
	@FindBy(xpath = "//input[@type='search']")
	public static WebElement search_country;
	
	@FindBy(xpath = "//li[@id='select2-countryselect-result-v2vd-644662e64f6a61941b02e73d']")
	public static WebElement country;
	
	@FindBy(xpath = "//li[@id='select2-state-dropdown-result-tv6k-644663004f6a61941b02f381']")
	public static WebElement state;
	
	@FindBy(xpath = "//li[@id='select2-city-dropdown-result-lm7y-644663014f6a61941b02f3c9']")
	public static WebElement city;
	
	@FindBy(xpath = "//input[@id='pincode']")
	public static WebElement pincode;
	
	@FindBy(xpath = "//input[@id='landmark']")
	public static WebElement landmark;
	
	@FindBy(xpath = "//input[@id='address']")
	public static WebElement address;
	
	@FindBy(xpath = "//input[@id='shippingaddress']")
	public static WebElement shippingcheckbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	public static WebElement update3;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[4]")
	public static WebElement logoutbtn;
	
	
	
	
	
	
	public Object update2click(WebDriver driver)
	{
		JavascriptExecutor je= (JavascriptExecutor)driver;
		return je.executeScript("arguments[0].click();", update2);
	}
	
	
	
	

}
