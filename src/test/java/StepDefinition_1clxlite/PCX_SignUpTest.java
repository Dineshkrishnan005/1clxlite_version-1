package StepDefinition_1clxlite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PCX_SignUpTest 
{
	public static WebDriver driver;
	
	@Given("I want enter signup section")
	public void i_want_enter_signup_section() 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://dev.1clxlite.com/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    WebElement signupbtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	    signupbtn.click();
	    
	    
	    
	}
	
	@When("I enter {string} , {string} and {string}")
	public void i_enter_and(String string, String string2, String string3) throws InterruptedException 
	{
	    WebElement entername = driver.findElement(By.xpath("//input[@name='name']"));
	    entername.sendKeys(string);
	    Thread.sleep(3000);
	    
	    WebElement entermail = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	    entermail.sendKeys(string2);
	    Thread.sleep(3000);
        
	    WebElement enterpass = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
	    enterpass.sendKeys(string3);
	    Thread.sleep(3000);

	    
	}
	
	@Then("I clicks the signup button for otp verification")
	public void i_clicks_the_signup_button_for_otp_verification() throws InterruptedException 
	{
		
	    WebElement signupbtn = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]"));
	    signupbtn.click();
	    Thread.sleep(3000);

	    
	}


}
