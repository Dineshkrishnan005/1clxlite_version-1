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

public class SSO_Login_ECX
{
	
	public static WebDriver driver;
	
	@Given("the enters the Google signin page")
	public void the_enters_the_google_signin_page() throws InterruptedException 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[2]"));
		loginbtn.click();

		WebElement signin = driver.findElement(By.xpath("//a[@id='signIn']"));
		signin.click();
		
		Thread.sleep(3000);
        
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='loginEcxRadio']"));
		radiobtn.click();
		Thread.sleep(3000);

		WebElement googleicon = driver.findElement(By.xpath("(//img[@class='img-fluid google_img mx-1'])[2]"));
		googleicon.click();
		Thread.sleep(3000);
	}

	@When("user enters their credentials")
	public void user_enters_their_credentials() throws InterruptedException 
	{
		WebElement entermail = driver.findElement(By.xpath("//input[@id='identifierId']"));
		entermail.sendKeys("sachinanand584@gmail.com");
		entermail.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement enterpass = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		enterpass.sendKeys("Sachin@16");
		enterpass.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("User sees the results depends on their credentils")
	public void user_sees_the_results_depends_on_their_credentils()
	{
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Given("the user enters the Fb-Signin page")
	public void the_user_enters_the_fb_signin_page() throws InterruptedException
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[2]"));
		loginbtn.click();


		WebElement signin = driver.findElement(By.xpath("//a[@id='signIn']"));
		signin.click();
		Thread.sleep(3000);

        
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='loginEcxRadio']"));
		radiobtn.click();
		Thread.sleep(3000);

		WebElement fbicon = driver.findElement(By.xpath("(//img[@class='img-fluid facebook_img mx-1'])[2]"));
		fbicon.click();
		Thread.sleep(3000);

	}

	@When("user enters their valid credentials")
	public void user_enters_their_valid_credentials() throws InterruptedException 
	{
		WebElement fbmail = driver.findElement(By.xpath("//input[@id='email']"));
		fbmail.sendKeys("oneclickusaads@gmail.com");
		Thread.sleep(3000);

		WebElement fbpass = driver.findElement(By.xpath("//input[@id='pass']"));
		fbpass.sendKeys("Onecl@ck@3214");
		Thread.sleep(3000);
	}

	@Then("Users should click login button for signin")
	public void users_should_click_login_button_for_signin() throws InterruptedException 
	{
		 WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		    loginbtn.click();
		    Thread.sleep(3000);
	}

	@Given("the User enters the Twitter-Sigin page")
	public void the_user_enters_the_twitter_sigin_page() throws InterruptedException 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[2]"));
		loginbtn.click();

		WebElement signin = driver.findElement(By.xpath("//a[@id='signIn']"));
		signin.click();
		Thread.sleep(3000);

		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='loginEcxRadio']"));
		radiobtn.click();
		Thread.sleep(3000);

		WebElement twittericon = driver.findElement(By.xpath("(//img[@class='img-fluid twitter_img mx-1 text-decoration-none'])[2]"));
		twittericon.click();
		Thread.sleep(3000);

	}

	@When("the user enters credentials")
	public void the_user_enters_credentials() throws InterruptedException 
	{
		WebElement usermail = driver.findElement(By.xpath("//input[@id='username_or_email']"));
		usermail.sendKeys("oneclickusaads@gmail.com");
		Thread.sleep(3000);

		WebElement userpass = driver.findElement(By.xpath("//input[@id='password']"));
		userpass.sendKeys("Onecl@ck@3214");
		Thread.sleep(3000);
	}

	@Then("User should click signin button for entering account dashboard")
	public void user_should_click_signin_button_for_entering_account_dashboard() throws InterruptedException 
	{
		WebElement signin = driver.findElement(By.xpath("//input[@id='allow']"));
	    signin.click();
	    Thread.sleep(5000);
	}


}
