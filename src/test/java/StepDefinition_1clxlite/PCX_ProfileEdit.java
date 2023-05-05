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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PCX_ProfileEdit 
{
    public static WebDriver driver;
	
    JavascriptExecutor js= (JavascriptExecutor)driver;
    
    @Given("Login with Valid entries and navigate to Dashboard")
    public void login_with_valid_entries_and_navigate_to_dashboard() throws InterruptedException
    {
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		   WebElement signupbtn = driver.findElement(By.partialLinkText("Signup"));
		   signupbtn.click();
		    
		    WebElement signinbtn = driver.findElement(By.xpath("(//a[@id='signIn'])[1]"));
			signinbtn.click();
		    Thread.sleep(3000);
		    

		  WebElement entermail = driver.findElement(By.xpath("//input[@id='email']"));
	      entermail.sendKeys("sachinanand584@gmail.com");
	      Thread.sleep(3000);
	      
	      WebElement enterpass = driver.findElement(By.xpath("//input[@id='signin_password']"));
	      enterpass.sendKeys("Sachin@11");
	      Thread.sleep(3000);

	      WebElement signinbtn1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       signinbtn1.click();
	       Thread.sleep(3000);

		
    }
    
    @When("User enters the PCX Profile dashboard section and clicks the navbar")
    public void user_enters_the_pcx_profile_dashboard_section_and_clicks_the_navbar() throws InterruptedException
    {
    	WebElement Navbtn = driver.findElement(By.xpath("//i[@class='fa-solid fa-bars-staggered navbar-toggler main-color3 fs-2']"));
 	    Navbtn.click();
 	    Thread.sleep(3000);
    }
    
    @When("User clicks the My profile")
    public void user_clicks_the_my_profile() throws InterruptedException 
    {
    	WebElement myprofile = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[1]"));
	    myprofile.click();
	    Thread.sleep(3000);
    }
    
    @When("User enters the name")
    public void user_enters_the_name() throws InterruptedException 
    {
       WebElement entername = driver.findElement(By.xpath("//input[@name='name']"));
       entername.clear();
       entername.sendKeys("Sachin");
	    Thread.sleep(3000);

    }
    
    @When("User enters the Phone number")
    public void user_enters_the_phone_number() throws InterruptedException 
    {
        WebElement phnumber = driver.findElement(By.xpath("//input[@id='user_mobile']"));
        phnumber.clear();
	    Thread.sleep(2000);
        phnumber.sendKeys("8148862533");
	    Thread.sleep(2000);

    }
    
    @Then("User clicks the UpdateButton1")
    public void user_clicks_the_update_button1() throws InterruptedException 
    {
        WebElement upadte1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        upadte1.click();
	    Thread.sleep(3000);
	    
	    WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    popup.click();
	    Thread.sleep(3000);


    }

    @Given("User enters the Old password")
    public void user_enters_the_old_password() throws InterruptedException 
    {
        WebElement oldpass = driver.findElement(By.xpath("//input[@name='old_password']"));
        oldpass.sendKeys("Sachin@11");
	    Thread.sleep(3000);

    }
    
    @When("User enters the New Password")
    public void user_enters_the_new_password() throws InterruptedException 
    {
        WebElement newpass = driver.findElement(By.xpath("//input[@name='password']"));
        newpass.sendKeys("Sachin@22");
	    Thread.sleep(3000);

        
    }
    
    @When("User enters the Verify password")
    public void user_enters_the_verify_password() throws InterruptedException 
    {
        WebElement verifypass = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
        verifypass.sendKeys("Sachin@22");
	    Thread.sleep(3000);

    }
    
    @Then("User clicks the UpdateButton2")
    public void user_clicks_the_update_button2() throws InterruptedException 
    {
		
		
		  WebElement update2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		  js.executeScript("arguments[0].click();",update2);
		  //update2.click(); 
		  
		  Thread.sleep(2000);
		  
		  WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[3]")); 
		  popup.click();
		  
		  Thread.sleep(2000);
		 
		 

    }

    @Given("User enters the Razorpay id")
    public void user_enters_the_razorpay_id() throws InterruptedException 
    {
    	
        WebElement razorid = driver.findElement(By.xpath("//input[@name='key_id']"));
        razorid.clear();
        razorid.sendKeys("rzp_test_vuVWkHnbavXAdC");
	    Thread.sleep(3000);

        
    }
    @When("User enters the Razorpay Key")
    public void user_enters_the_razorpay_key() throws InterruptedException 
    {
        WebElement razorkey = driver.findElement(By.xpath("//input[@name='secret_id']"));
        razorkey.clear();
        razorkey.sendKeys("JwXA4Cfh0LaOom2pio41F6C4");
	    Thread.sleep(3000);

    }
    @Then("User clicks the UpdateButton3")
    public void user_clicks_the_update_button3() throws InterruptedException 
    {
    	WebElement update3 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        update3.click();
	    Thread.sleep(2000);
	    
	    WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    popup.click();
	    Thread.sleep(2000);
    }
    
    @Given("User choose the business")
    public void user_choose_the_business() throws InterruptedException
    {
		
		
    	WebElement products = driver.findElement(By.xpath("//input[@id='flexCheckDefault1']"));
		js.executeScript("arguments[0].click();",products);
	    //products.click();
	   	Thread.sleep(2000);
			 
	       
		WebElement service=driver.findElement(By.xpath("//input[@id='flexCheckDefault']"));
	    js.executeScript("arguments[0].click();",service);
	    //service.click();
		Thread.sleep(2000);
		
		  
		  
		 

    }
    @Then("User clicks the UpdateButton4")
    public void user_clicks_the_update_button4() throws InterruptedException 
    {
    	
    	WebElement update4 = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
    	js.executeScript("arguments[0].click();",update4);
        //update4.click();
	    Thread.sleep(2000);

        
        WebElement popup = driver.findElement(By.xpath("//button[@type='button'][text()='OK']"));
        popup.click();
        Thread.sleep(2000);
	    
	   
    }
    
    @Given("User enters the Gst Number")
    public void user_enters_the_gst_number() throws InterruptedException 
    {
    	
       WebElement entergst = driver.findElement(By.xpath("//input[@name='gst_no']"));
       entergst.clear();
       entergst.sendKeys("07AAGFF2194N1Z1");
	   Thread.sleep(3000);

    }
    @Given("User clicks the Update Button5")
    public void user_clicks_the_update_button5() throws InterruptedException
    {
    	WebElement update5 = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
        update5.click();
	    Thread.sleep(3000); 
	    
	    WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    popup.click();
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollBy(0,-3000)","");
    	Thread.sleep(2000);

    }
    
    @Given("User clicks edit pic label and upload the picture")
    public void user_clicks_edit_pic_label_and_upload_the_picture() throws InterruptedException, AWTException
    {
    	WebElement changeprofile = driver.findElement(By.xpath("//label[@title='Change Profile']"));
    	js.executeScript("arguments[0].click();",changeprofile);
    	changeprofile.click();
    	Thread.sleep(2000);
    	
    	Robot rb = new Robot();
    	 
        // copying File path to Clipboard
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
   	     	
        WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    popup.click();
 	   Thread.sleep(3000);
 	   
    }

    @When("User Clicks delete lable for deleting the upload picture")
    public void user_clicks_delete_lable_for_deleting_the_upload_picture() throws InterruptedException 
    {
       
    	WebElement deletebtn = driver.findElement(By.xpath("//span[@title='Remove Profile']"));
    	deletebtn.click();
    	Thread.sleep(2000);

    	WebElement deletebtn2 = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
    	deletebtn2.click();
    	Thread.sleep(2000);

    	WebElement popup = driver.findElement(By.xpath("//button[@type='button'][text()='OK']"));
    	js.executeScript("arguments[0].click();",popup);
    	//popup.click();

    	Thread.sleep(2000);
    	
    	
    }

    @Then("User logout from the pcx account")
    public void user_logout_from_the_pcx_account() throws InterruptedException
    {
    	WebElement Navbtn1 = driver.findElement(By.xpath("//i[@class='fa-solid fa-bars-staggered navbar-toggler main-color3 fs-2']"));
 	    Navbtn1.click();
 	    Thread.sleep(2000);
 	    
 	    WebElement logoutbtn = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[4]"));
 	    logoutbtn.click();  

    	
    	
    }
    
    

 
}
