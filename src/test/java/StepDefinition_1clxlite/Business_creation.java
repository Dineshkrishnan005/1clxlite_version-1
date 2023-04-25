package StepDefinition_1clxlite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Business_creation {
	
	public static WebDriver driver;
	
// 1.Business Profile  
	@Given("Successful Login with Valid entries and navigate to Business Profile")
	public void successful_login_with_valid_entries_and_navigate_to_business_profile() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		
		/*
		 * WebElement facebook =
		 * driver.findElement(By.xpath("(//img[@alt='facebook.svg'])[1]"));
		 * facebook.click(); Thread.sleep(3000);
		 * 
		 * WebElement facebookmail =
		 * driver.findElement(By.xpath("//input[@id='email']"));
		 * facebookmail.sendKeys("oneclickusaads@gmail.com"); WebElement password =
		 * driver.findElement(By.xpath("//input[@name='pass']"));
		 * password.sendKeys("Onecl@ck@3214"); Thread.sleep(3000);
		 * password.sendKeys(Keys.ENTER); Thread.sleep(3000);
		 */
		WebElement signIn = driver.findElement(By.xpath("(//a[@id='signIn'])[1]"));
		signIn.click();
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[3]"));
		email.sendKeys("");
	}
	@When("User able to click the checkbox for Service or product")
	public void user_able_to_click_the_checkbox_for_service_or_product() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='services']"));
		checkbox.click();
		
	}
	@When("User able to enter the Business Name")
	public void user_able_to_enter_the_business_name() {
		WebElement businessName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		businessName.sendKeys("Quality Analyst");
		
	}
	@When("User able to enter the Multiple category of Business")
	public void user_able_to_enter_the_multiple_category_of_business() {
		WebElement category = driver.findElement(By.xpath("(//input[@type='select-one'])[1]"));
		category.sendKeys("API Testing,Functional Testing,Non-Functional Testing,Appium,Selenium");
	}
	@Then("Click the next button")
	public void click_the_next_button() {
		WebElement businessButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		businessButton.sendKeys(Keys.ENTER);
		
		
	}
	
	//2.Location & contact info
	@Given("User able to enter the Street Name")
	public void user_able_to_enter_the_street_name() {
		WebElement streetName = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		streetName.sendKeys("1123");
	}
	@When("User able to enter the city name")
	public void user_able_to_enter_the_city_name() {
		WebElement cityName = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
		cityName.sendKeys("Porur");
	}
	@When("User able to enter the state")
	public void user_able_to_enter_the_state() {
		WebElement state = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[2]/div[2]/input[1]"));
		state.sendKeys("Tamilnadu");
		
	}
	@When("User able to enter the country")
	public void user_able_to_enter_the_country() {
		WebElement country = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]"));
		country.sendKeys("India");
	}
	@When("user able to enter the pincode")
	public void user_able_to_enter_the_pincode() {
		WebElement pincode = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/form[2]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));
		pincode.sendKeys("632502");
	}
	@When("user able to enter the PhoneNumber")
	public void user_able_to_enter_the_phone_number() {
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone_tel']"));
		phoneNumber.sendKeys("6379732890");
		
	}
	@When("user able to enter the Whatsapp No")
	public void user_able_to_enter_the_whatsapp_no() {
		WebElement whatsappNo = driver.findElement(By.xpath("//input[@name='whatsapp_tel']"));
		whatsappNo.sendKeys("6379732890");
	}
	@Then("User able to click the next button")
	public void user_able_to_click_the_next_button() throws InterruptedException {
		WebElement previous1 = driver.findElement(By.xpath("//button[@id='previous1']"));
		previous1.click();
		Thread.sleep(3000);
		
		WebElement businessButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		businessButton.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement next1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		next1.click();
		
	}
	//3.Add Business Description
	@When("User able to fill the Business Page Description")
	public void user_able_to_fill_the_business_page_description() {
		WebElement description = driver.findElement(By.xpath(" //textarea[@name='description']"));
		description.sendKeys("Provide an overview of the business.This description provides extensive details outlining the business");
		
	}
	@When("User able to enter the Email Id")
	public void user_able_to_enter_the_email_id() {
		WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
		emailId.clear();
		emailId.sendKeys("citab63217@momoshe.com");
	}
	@When("User able to enter the Existing Website")
	public void user_able_to_enter_the_existing_website() {
		WebElement existingWebsite = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		existingWebsite.sendKeys("https://www.tagexpo.in/d-reg-exhibitor");
		
	}
	@Then("user able click the next button")
	public void user_able_click_the_next_button() throws InterruptedException {
		WebElement previous2 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		previous2.click();
		Thread.sleep(3000);
		WebElement next2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		next2.click();
		Thread.sleep(3000);
		WebElement next3 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		next3.click();
		
	}
	//4.Add Photos for your business
	@When("User able to upload the Logo Image")
	public void user_able_to_upload_the_logo_image() {
		
	}
	@When("User able to upload the Header Image")
	public void user_able_to_upload_the_header_image() {
		
	}
	@Then("user able to click Next Button")
	public void user_able_to_click_next_button() {
		
	}
	//5.Easily In Minutes
	@When("User able to enter the Publish button")
	public void user_able_to_enter_the_publish_button() {
		
	}
	@Then("user able to click the DashBoard button")
	public void user_able_to_click_the_dash_board_button() {
		
	}

}
