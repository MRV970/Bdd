package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin {
	WebDriver driver;
	@Given("Browser is open and URL navigated")
	public void browser_is_open_and_url_navigated() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.shoppersstack.com/");
	}

	@Given("Login page will be displayed")
	public void login_page_will_be_displayed() {
	    driver.findElement(By.id("loginBtn")).click();
	}

	@Given("Shopper Login is Displayed")
	public void shopper_login_is_displayed() {
	 Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(.,'Shopper')]")).isDisplayed());
	}
	@Given("Merchant Login is Displayed")
	public void merchant_login_is_displayed() {
	    driver.findElement(By.xpath("//button[text()='Merchant Login']")).click();
	}
	@Given("Admin Login is Displayed")
	public void admin_login_is_displayed() {
		driver.findElement(By.xpath("//button[text()='Admin Login']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    driver.findElement(By.id("Email")).sendKeys(username);
	    driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@When("clicks on  login button")
	public void clicks_on_login_button1() {
		   driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
//	

	@Then("shopper should be successfully logged in")
	public void shopper_should_be_successfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(.,'Hello')]")).isDisplayed());
	}

	@Then("Browser must be closed")
	public void browser_must_be_closed() {
	    driver.quit();
	}

//	@Given("Merchant Login is Displayed")
//	public void merchant_login_is_displayed() {
//	    driver.findElement(By.xpath("//button[text()='Merchant Login']")).click();
//	}

//	@When("clicks on  login button")
//	public void clicks_on_login_button1() {
//		   driver.findElement(By.xpath("//span[text()='Login']")).click();
//	}

	@Then("Merchant should be successfully logged in")
	public void merchant_should_be_successfully_logged_in() {
	   System.out.println("Merchant not logged in");
	}

//	@Given("Admin Login is Displayed")
//	public void admin_login_is_displayed() {
//		driver.findElement(By.xpath("//button[text()='Admin Login']")).click();
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//	}

	@Then("Admin should be successfully logged in")
	public void admin_should_be_successfully_logged_in() {
	Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Approved Merchant']")).isDisplayed());
	}

}
