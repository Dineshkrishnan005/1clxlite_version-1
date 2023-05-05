package StepDefinition_1clxlite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object_Classes.ECX_Edit_profile_Object;

public class ECX_Edit_Profile 
{

	static  WebDriver driver;

	 ECX_Edit_profile_Object ECXeditprofObj;
	 


	@Given("the user enters the ECX-Dashboard")
	public void the_user_enters_the_ecx_dashboard() throws InterruptedException 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		ECXeditprofObj=new ECX_Edit_profile_Object(driver);
		

		ECXeditprofObj.signupbtn.click();

		ECXeditprofObj.signinbtn.click();

		Thread.sleep(2000);

		ECXeditprofObj.radiobtn.click();

		ECXeditprofObj.entermail.sendKeys("sachin33.theinfinityhub@gmail.com");

		ECXeditprofObj.enterpwd.sendKeys("Sachin@33");

		ECXeditprofObj.rememberme.click();

		ECXeditprofObj.submitbtn.click();



	}



	@When("the user enters edit profile section")
	public void the_user_enters_edit_profile_section() 
	{

		ECXeditprofObj.menubar.click();

		ECXeditprofObj.myprofile.click();
	}

	@When("the user enters the name")
	public void the_user_enters_the_name() 
	{

		ECXeditprofObj.name.clear();
		ECXeditprofObj.name.sendKeys("TestingSachin");



	}

	@When("the user enters the Phone number")
	public void the_user_enters_the_phone_number() 
	{

		ECXeditprofObj.mobilenum.clear();
		ECXeditprofObj.mobilenum.sendKeys("9876543210");
	}

	@When("the user clicks the update button1")
	public void the_user_clicks_the_update_button1() throws InterruptedException 
	{


		ECXeditprofObj.update1.click();

		  Thread.sleep(2000);

		
		  WebElement popup1 =driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		  popup1.click();
		 


	}

	@When("the user enters the old password")
	public void the_user_enters_the_old_password() 
	{

		ECXeditprofObj.oldpwd.sendKeys("Sachin@33");

	}

	@When("the user enters the new password")
	public void the_user_enters_the_new_password() 
	{

		ECXeditprofObj.newpwd.sendKeys("Sachin@44");
	}

	@When("the user enters the verify password")
	public void the_user_enters_the_verify_password() throws InterruptedException 
	{

		ECXeditprofObj.verifypwd.sendKeys("Sachin@44"); 

		Thread.sleep(2000);

	}

	@When("the user clicks the update button2")
	public void the_user_clicks_the_update_button2() throws InterruptedException 
	{


		ECXeditprofObj.update2click(driver);

		Thread.sleep(2000);

		WebElement popup2 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		popup2.click();


	}

	@When("the user choose the country name")
	public void the_user_choose_the_country_name() throws InterruptedException
	{
		ECXeditprofObj.search_country.sendKeys("India");
		Thread.sleep(2000);
		
		ECXeditprofObj.country.click(); 
		Thread.sleep(2000);
	}

	@When("the user choose the state name")
	public void the_user_choose_the_state_name() throws InterruptedException 
	{

		ECXeditprofObj.state.click();

		Thread.sleep(2000);
	}

	@When("the user choose the city name")
	public void the_user_choose_the_city_name() throws InterruptedException 
	{

		ECXeditprofObj.city.click();
		Thread.sleep(2000);
	}

	@When("the user enters the pincode")
	public void the_user_enters_the_pincode() 
	{

		ECXeditprofObj.pincode.clear();

		ECXeditprofObj.pincode.sendKeys("638711");
	}

	@When("the user enters the landmark")
	public void the_user_enters_the_landmark() 
	{

		ECXeditprofObj.landmark.clear();
		ECXeditprofObj.landmark.sendKeys("Opposite sakthi mahal,perundurai road");
	}

	@When("the user enters the Address")
	public void the_user_enters_the_address() 
	{

		ECXeditprofObj.address.sendKeys("theinfinityhub");
	}

	@When("the user clicks shipping address checkbox")
	public void the_user_clicks_shipping_address_checkbox() 
	{

		ECXeditprofObj.shippingcheckbox.click();

	}

	@When("the user clicks the update button3")
	public void the_user_clicks_the_update_button3() throws InterruptedException 
	{

		ECXeditprofObj.update3.click();

		Thread.sleep(2000);

		WebElement popup3 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		popup3.click();

	}

	@When("the user cliks the change the profile picture")
	public void the_user_cliks_the_change_the_profile_picture() throws InterruptedException, AWTException 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement changeprofile = driver.findElement(By.xpath("//label[@title='Change Profile']"));
		js.executeScript("arguments[0].click();",changeprofile);
		changeprofile.click();

		Thread.sleep(2000);

		Robot rb = new Robot();

		//copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\Sachithanandhan.S\\Downloads\\logo-1.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);



		WebElement popup4 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		popup4.click();

		Thread.sleep(2000);
	}

	@When("the user delete the profile picture")
	public void the_user_delete_the_profile_picture() throws InterruptedException 
	{
		WebElement deletepic = driver.findElement(By.xpath("//span[@title='Remove Profile']"));
		deletepic.click();


		WebElement delpopup = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		delpopup.click();

		Thread.sleep(2000);

		WebElement popup5= driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		popup5.click();


	}

	@Then("the user logout from the ECX account")
	public void the_user_logout_from_the_ecx_account()
	{

		ECXeditprofObj.menubar.click();

		ECXeditprofObj.logoutbtn.click();
	}


}
