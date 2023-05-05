package StepDefinition_1clxlite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PCX_SignIn_Test 
{
   public static WebDriver driver;
   
   @Given("the user enters the signin page")
   public void the_user_enters_the_signin_page() throws InterruptedException 
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
		
	    Thread.sleep(3000);
	    
   }
   
   @When("the user enters the {string} and {string}")
   public void the_user_enters_the_and(String string, String string2) throws InterruptedException 
   {
      WebElement entermail = driver.findElement(By.xpath("//input[@id='email']"));
      entermail.sendKeys(string);
      Thread.sleep(2000);
      
      WebElement enterpass = driver.findElement(By.xpath("//input[@id='signin_password']"));
      enterpass.sendKeys(string2);
      Thread.sleep(2000);

   }
   
   @When("the user clicks the login button")
   public void the_user_clicks_the_login_button() throws InterruptedException 
   {
	   WebElement rememberme = driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
	   rememberme.click();
	   Thread.sleep(2000);
	   
       WebElement signinbtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
       signinbtn.click();
       Thread.sleep(2000);
   }
   
   @Then("user enters the pcx dashboard or displaying the results depends on their credentials")
   public void user_enters_the_pcx_dashboard_or_displaying_the_results_depends_on_their_credentials() throws InterruptedException 
   {
       WebElement menubar = driver.findElement(By.xpath("//i[@class='fa-solid fa-bars-staggered navbar-toggler main-color3 fs-2']"));
       menubar.click();
       Thread.sleep(2000);
       
       WebElement logoutbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[4]"));
       logoutbtn.click();
       Thread.sleep(2000);

       driver.close();
       
   }

	
	
}
