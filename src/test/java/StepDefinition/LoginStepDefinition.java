package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	static WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30, 0));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);

	}

	@When("user enter correct username and password")
	public void user_enter_correct_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(3000);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
	}
	@Then("user should redirect to Home Page")
	public void user_should_redirect_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	String	expectedURL= ("https://www.saucedemo.com/inventory.html");
	String ActualURL= driver.getCurrentUrl();
		if (expectedURL.equals(ActualURL))
			System.out.println("Login_Successful");
	}

	@And("close the Browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
	

	}


