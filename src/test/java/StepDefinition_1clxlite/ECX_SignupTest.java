package StepDefinition_1clxlite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object_Classes.ECX_Signup_Object;

public class ECX_SignupTest 
{
  public static WebDriver driver;
  
  ECX_Signup_Object obj1;
  
  
  @Given("user want enter signup section")
  public void user_want_enter_signup_section() throws InterruptedException 
  {
	   System.setProperty("webdriver.http.factory", "jdk-http-client");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://dev.1clxlite.com/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    obj1=new ECX_Signup_Object(driver);
	    
	     obj1.signupbtn.click();
	   
	    Thread.sleep(2000);
	    
	    obj1.ecxradiobtn.click();
	    
	    
  }
  @When("user enter {string} , {string} and {string}")
  public void user_enter_and(String string, String string2, String string3) throws InterruptedException 
  {
	    obj1.entername.sendKeys(string);
	    Thread.sleep(2000);
	    
	    obj1.entermail.sendKeys(string2);
	    Thread.sleep(2000);
      
	    obj1.enterpwd.sendKeys(string3);
	    Thread.sleep(2000);

  }
  
  @Then("user clicks the create account button for otp verification")
  public void user_clicks_the_create_account_button_for_otp_verification() throws InterruptedException
  {
	    obj1.signupbtn2.click();
	    Thread.sleep(2000);
	    
	    if(obj1.verifyotp.isDisplayed())
	    {
	    	obj1.verifyotp.click();
	    	System.out.println("Element displayed");

	    }
	    else
	    {
	    	System.out.println("Element Not displayed");
	    }
  }

	
}
