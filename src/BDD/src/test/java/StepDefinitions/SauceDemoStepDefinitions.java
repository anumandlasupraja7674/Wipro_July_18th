package StepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class SauceDemoStepDefinitions {
	WebDriver driver = DriverFactory.getDriver();
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(8000);
	}

	@When("user enters the Username")
	public void user_enters_the_username() throws InterruptedException {
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(8000);
	}

	@When("user enters the Password")
	public void user_enters_the_password() throws InterruptedException {
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		Thread.sleep(8000);
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();

		Thread.sleep(8000);
	}

	@When("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		//homepage navigation
				WebElement title = driver.findElement(By.xpath("//span[@class='title']"));
				Thread.sleep(10000);
				 
				if (title.isDisplayed()) {
					System.out.println("User is on the home page");
				} else {
		 
					System.out.println("User is not on the home page");
				}
	}

	@When("user added the products to cart")
	public void user_added_the_products_to_cart() throws InterruptedException {
		WebElement addToCart =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addToCart.click();

		Thread.sleep(8000);

	}

	@When("user enters into cart")
	public void user_enters_into_cart() throws InterruptedException {
		WebElement cart =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();

		Thread.sleep(8000);
	}

	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		WebElement checkOut =driver.findElement(By.xpath("//button[@id='checkout']"));
		checkOut.click();

		Thread.sleep(8000);
	}

	@When("user enters firstName")
	public void user_enters_first_name() throws InterruptedException {
		WebElement firstName= driver.findElement(By.xpath("//input[@id='first-name']"));
		firstName.sendKeys("standard");

		Thread.sleep(8000);
	}

	@When("user enters lastName")
	public void user_enters_last_name() throws InterruptedException {
		WebElement lastName= driver.findElement(By.xpath("//input[@id='last-name']"));
		lastName.sendKeys("user");

		Thread.sleep(8000);
	}

	@When("user enters postalCode")
	public void user_enters_postal_code() throws InterruptedException {
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		postalCode.sendKeys("534341");

		Thread.sleep(8000);
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		WebElement continueButton =driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();

		Thread.sleep(8000);
	}

	@When("user clicks on finish button")
	public void user_clicks_on_finish_button() throws InterruptedException {
		WebElement finishButton =driver.findElement(By.xpath("//button[@id='finish']"));
		finishButton.click();

		Thread.sleep(8000);
	}

	@When("user clicks on back to home button")
	public void user_clicks_on_back_to_home_button() throws InterruptedException {
		WebElement backToHomeButton =driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backToHomeButton.click();

		Thread.sleep(8000);
	}

	@When("user clicks on menu button")
	public void user_clicks_on_menu_button() throws InterruptedException {
		WebElement menu =driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();

		Thread.sleep(8000);

	}

	@Then("user clicks on logOut button")
	public void user_clicks_on_log_out_button() throws InterruptedException {
		WebElement logOutButton =driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logOutButton.click();

		Thread.sleep(8000);

	}

}
