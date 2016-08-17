package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSmokeTest {
	
	WebDriver driver;
	
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://account.shodan.io/login");
	}

	@When("^user provide valid username and password$")
	public void user_provide_valid_username_and_password() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("p_mlu");
	    driver.findElement(By.name("password")).sendKeys("Beehive08");
	    		
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    driver.findElement(By.name("login_submit")).click();
	}


}
