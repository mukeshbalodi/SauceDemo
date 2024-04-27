package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class AddToCartStepDefinition {
	
	static WebDriver driver;

	@Given("user is on Home Page")
	public void user_is_on_home_page() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30, 0));
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
	}

	@And("user click on Add to cart Button")
	public void user_click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	    
	}

	@Then("item should be added to the cart successfully")
	public void item_should_be_added_to_the_cart_successfully() {
	}

	@And("User can see the item by pressing cart icon")
	public void user_can_see_the_item_by_pressing_cart_icon() {
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}

	@And("close the Broswer")
	public void close_the_broswer() {
	driver.close();
	    
	}


}
