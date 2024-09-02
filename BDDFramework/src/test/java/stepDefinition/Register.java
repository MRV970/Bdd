package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Given("Browser is open")
	public void browser_is_open() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() {
	   driver.findElement(By.partialLinkText("Register")).click();
	}

	@When("user  enters valid credentials")
	public void user_enters_valid_credentials() {
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("userTest");
	    driver.findElement(By.id("LastName")).sendKeys("QA");
	    driver.findElement(By.id("Email")).sendKeys("userqtest_qa123@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Password@123");
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123");
	}

	@When("clicks on register button")
	public void clicks_on_register_button() {
	    driver.findElement(By.id("register-button")).click();
	}

	@Then("a new account should be created")
	public void a_new_account_should_be_created() {
	   Assert.assertTrue( driver.findElement(By.xpath("//div[@class='result']")).isDisplayed());
	}

	@Then("browser must be closed")
	public void browser_must_be_closed() {
	    driver.close();
	}




}
