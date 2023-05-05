package StepDefinition_1clxlite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ECX_LoginTest 
{
  
	public static WebDriver driver;
	
	@Given("the user enters the ECX Signin page")
	public void the_user_enters_the_ecx_signin_page() throws InterruptedException
	{
		   System.setProperty("webdriver.http.factory", "jdk-http-client");
		   driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://dev.1clxlite.com/");
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    WebElement loginbtn = driver.findElement(By.partialLinkText("Signup"));
		    loginbtn.click();
		    
		    WebElement signinbtn = driver.findElement(By.xpath("(//a[@id='signIn'])[1]"));
			signinbtn.click();
			
		    Thread.sleep(2000);
		    
		    WebElement ecxradio = driver.findElement(By.xpath("//input[@id='loginEcxRadio']"));
		    ecxradio.click();
		    
		    Thread.sleep(2000);
	}
	
	@When("the user enters the credentials like {string} and {string}")
	public void the_user_enters_the_credentials_like_and(String string, String string2) throws InterruptedException 
	{
		  WebElement entermail = driver.findElement(By.xpath("//input[@id='email']"));
	      entermail.sendKeys(string);
	      Thread.sleep(2000);
	      
	      WebElement enterpass = driver.findElement(By.xpath("//input[@id='signin_password']"));
	      enterpass.sendKeys(string2);
	      Thread.sleep(2000);

	}
	
	@When("the user clicks the ECX Login button")
	public void the_user_clicks_the_ecx_login_button() throws InterruptedException 
	{
		  WebElement signinbtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       signinbtn.click();
	       
	       Thread.sleep(3000);
	}
	
	@Then("the user enters the ECX Dashboard")
	public void the_user_enters_the_ecx_dashboard() throws InterruptedException 
	{
	  WebElement ecxmenubar = driver.findElement(By.xpath("//i[@class='fa-solid fa-bars-staggered navbar-toggler main-color3 fs-2']"));
	  ecxmenubar.click();
	  
      Thread.sleep(2000);
      
      WebElement logoutbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[4]"));
      logoutbtn.click();
      

	}


	
	
}
