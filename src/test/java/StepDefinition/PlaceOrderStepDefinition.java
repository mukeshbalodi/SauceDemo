package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderStepDefinition {
	static WebDriver driver;
	@Given("user is on cart page")
	public void user_is_on_cart_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30, 0));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
	   
	}

	@When("user clicks on Checkout Button")
	public void user_clicks_on_checkout_button() {
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		
		
	}

	@Then("User is Redirect to Checkout: Your Information page")
	public void user_is_redirect_to_checkout_your_information_page() {
	    
	}

	@And("fill details")
	public void fill_details() {
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Mukesh");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Balodi");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("121365");

	    
	}

	@And("click on continue Button")
	public void click_on_continue_button() {
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		
	    
	}

	@Then("user should Redirected to Checkout: Overview page")
	public void user_should_redirected_to_checkout_overview_page() {
	    
	}

	@When("User click on finish Button")
	public void user_click_on_finish_button() {
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

		
	   
	}

	@Then("user see a message Thank you for your order!")
	public void user_see_a_message_thank_you_for_your_order() {
	   
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	    
	}


}
