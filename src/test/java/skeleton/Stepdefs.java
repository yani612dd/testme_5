package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
	
	@Given("user launches browser And navigates to application url")
	public void user_launches_browser_And_navigates_to_application_url() {
	    System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    
	    driver = new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("http://localhost:8083/TestMeApp");
	}
	
	@When("user enter SignIn And clicks on Register Here")
	public void user_enter_SignIn_And_clicks_on_Register_Here() {
		driver.findElement(By.linkText("SignUp")).click();
			    
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enters firstname as {string} in firstname field")
	public void user_enters_firstname_as_in_firstname_field(String fn) {
	    driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@When("user enters lastname as {string} in lastname field")
	public void user_enters_lastname_as_in_lastname_field(String ln) {
	   driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	
	@When("user enters Password as {string} in password field")
	public void user_enters_Password_as_in_password_field(String pwd) {
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	
	@When("user enters confirm password as {string} in confirm password field")
	public void user_enters_confirm_password_as_in_confirm_password_field(String cpwd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
	}

	@When("user enters gender as {string} in gender field")
	public void user_enters_gender_as_in_gender_field(String string) {
	  driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enters email as {string} in email field")
	public void user_enters_email_as_in_email_field(String mail) {
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	} 
	
	@When("user enters mobile number as {string} in mobile number")
	public void user_enters_mobile_number_as_in_mobile_number(String num) {
	    driver.findElement(By.name("mobileNumber")).sendKeys(num);
	}

	@When("user enters DOB as {string} in DOB")
	public void user_enters_DOB_as_in_DOB(String birthdate) {
	 driver.findElement(By.name("dob")).sendKeys(birthdate);
	}
	@When("user enters address as {string} in address")
	public void user_enters_address_as_in_address(String place) {
	    driver.findElement(By.name("address")).sendKeys(place);
	}

	@When("user enters security question as {string} in security question")
	public void user_enters_security_question_as_in_security_question(String ques) {
	 Select sq= new Select(driver.findElement(By.name("securityQuestion")));
	 sq.selectByIndex(1);
	}

	@When("user enters answer as {string} in answer")
	public void user_enters_answer_as_in_answer(String ans) {
	  driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@When("clicks Register")
	public void clicks_Register() {
		driver.findElement(By.name("Submit")).click();
	}
	
	@Then("validates Registration success")
	public void validates_Registration_success() {
	   //Assert.assertTrue(driver.getTitle().contains("TESTME"));
	}
   
}
