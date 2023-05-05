package StepDefinition_1clxlite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SSO_Login_PCX 
{
	public static WebDriver driver;
	
	@Given("I want to enter 1clx site landing page")
	public void i_want_to_enter_1clx_site_landing_page() 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://dev.1clxlite.com/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("clicks the signin button")
	public void clicks_the_signin_button() throws InterruptedException 
	{
		WebElement signinbtn = driver.findElement(By.partialLinkText("Signup"));
		signinbtn.click();
	    Thread.sleep(2000);
	    
	}

	@When("I clicks google icon and enters the signin with Google page")
	public void i_clicks_google_icon_and_enters_the_signin_with_google_page() throws InterruptedException 
	{
		
		

	  WebElement googleicon = driver.findElement(By.xpath("(//img[@class='img-fluid google_img mx-1'])[1]"));
	  googleicon.click();
	    Thread.sleep(3000);

	}

	@When("enters the mail id and clicks the next button")
	public void enters_the_mail_id_and_clicks_the_next_button() throws InterruptedException 
	{
		
	    WebElement entermail = driver.findElement(By.xpath("//input[@id='identifierId']"));
	    entermail.sendKeys("sachinanand584@gmail.com");
	    entermail.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);

	}

	@When("enters the password and clicks the next button")
	public void enters_the_password_and_clicks_the_next_button() throws InterruptedException
	{
		
	    WebElement enterpass = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
	    enterpass.sendKeys("Sachin@16");
	    enterpass.sendKeys(Keys.ENTER);
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	}

	@Given("I clicks facebook icon and enters the signin with Fb page")
	public void i_clicks_facebook_icon_and_enters_the_signin_with_fb_page() 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		   driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://dev.1clxlite.com/");
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    WebElement signinbtn = driver.findElement(By.partialLinkText("Signup"));
			signinbtn.click();
		    		    
		    WebElement fbicon = driver.findElement(By.xpath("(//img[@class='img-fluid facebook_img mx-1'])[1]"));
		    fbicon.click();
		    
		    
	}

	@When("enters the fb-mail id")
	public void enters_the_fb_mail_id() throws InterruptedException 
	{
		
	   WebElement fbmail = driver.findElement(By.xpath("//input[@id='email']"));
	   fbmail.sendKeys("oneclickusaads@gmail.com");
	    Thread.sleep(2000);

	   
	}

	@When("enters the fb-password")
	public void enters_the_fb_password() throws InterruptedException 
	{
		
	    WebElement fbpass = driver.findElement(By.xpath("//input[@id='pass']"));
	    fbpass.sendKeys("Onecl@ck@3214");
	    Thread.sleep(2000);

	}

	@When("i clicks the login button")
	public void i_clicks_the_login_button() throws InterruptedException 
	{
		
	    WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	    loginbtn.click();
	    Thread.sleep(2000);

	}

	@Then("enters the PCX profile create section")
	public void enters_the_pcx_profile_create_section() throws InterruptedException
	{
		
		WebElement businessname = driver.findElement(By.xpath("//input[@class='form-control p-3 border-primary border-1 rounded-3']"));
		businessname.sendKeys("Testing");
		
		Thread.sleep(3000);
	   
		driver.close();
	}

	@Given("I clicks Twitter icon and enters the signin with Twitter page")
	public void i_clicks_twitter_icon_and_enters_the_signin_with_twitter_page()
	{
      
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://dev.1clxlite.com/");
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    
		    WebElement signinbtn = driver.findElement(By.partialLinkText("Signup"));
			signinbtn.click();
			
		WebElement twittericon = driver.findElement(By.xpath("(//img[@class='img-fluid twitter_img mx-1 text-decoration-none'])[1]"));
		twittericon.click();
		
	}

	@When("enters the Twitter-mail id")
	public void enters_the_twitter_mail_id() throws InterruptedException 
	{
		
	    WebElement usermail = driver.findElement(By.xpath("//input[@id='username_or_email']"));
	    usermail.sendKeys("oneclickusaads@gmail.com");
	    Thread.sleep(3000);

	}

	@When("enters the Twitter-password")
	public void enters_the_twitter_password() throws InterruptedException 
	{
		
	    WebElement userpass = driver.findElement(By.xpath("//input[@id='password']"));
	    userpass.sendKeys("Onecl@ck@3214");
	    Thread.sleep(3000);

	}

	@When("i clicks the Signin button")
	public void i_clicks_the_signin_button() throws InterruptedException 
	{
	    WebElement signin = driver.findElement(By.xpath("//input[@id='allow']"));
	    signin.click();
	    Thread.sleep(5000);

	}

	@Then("It should enters the PCX profile create section")
	public void it_should_enters_the_pcx_profile_create_section() throws InterruptedException
	{
		WebElement businessname = driver.findElement(By.xpath("//input[@class='form-control p-3 border-primary border-1 rounded-3']"));
		businessname.sendKeys("Testing");
		
		
		 Thread.sleep(5000);
	   driver.close();
	}


}
