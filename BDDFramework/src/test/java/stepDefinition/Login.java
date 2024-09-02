package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated() {
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("Login page is dispalyed")
	public void login_page_is_dispalyed() {
	    driver.findElement(By.partialLinkText("Log in")).click();
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
	    driver.findElement(By.id("Email")).sendKeys("qa_testuser123@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Password@123");
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
	 
	   Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	}

	@Then("browser should be close")
	public void browser_should_be_close() {
	    driver.close();
	}


}
