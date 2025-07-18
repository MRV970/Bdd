package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Books {
	public WebDriver driver;

	@Given("browser is open to welecome page")
	public void browser_is_open_to_welecome_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	   
	}

	@When("user is logged in")
	public void user_is_logged_in(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists();
		String username= data.get(0).get(0);
		String password=data.get(0).get(1);
	   driver.findElement(By.partialLinkText("Log in")).click();
	   driver.findElement(By.id("Email")).sendKeys(username);
	   driver.findElement(By.id("Password")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@When("user clicks on Book page")
	public void user_clicks_on_book_page() {
	    driver.findElement(By.partialLinkText("Books")).click();
	    
	}

	@When("Books page is displayed")
	public void books_page_is_displayed() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("books"));
	}

	@When("User chooses A-Z in sort by dropdown")
	public void user_chooses_a_z_in_sort_by_dropdown() {
	    Select sel=new Select(driver.findElement(By.id("products-orderby")));
	    sel.selectByVisibleText("Name: A to Z");
	    
	}

	@Then("page should be sorted alphabetically")
	public void page_should_be_sorted_alphabetically() {
	    System.out.println("page is sorted");
	}

	@When("user clicks on add to cart button for Computing and Internet book")
	public void user_clicks_on_add_to_cart_button_for_computing_and_internet_book() {
	    driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
	}

	@Then("Book should be added to cart")
	public void book_should_be_added_to_cart() {
	   Assert.assertEquals(driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText(),"The product has been added to your ");
	   driver.quit();
	   
	}

	@When("user clicks on add to cart button for Health book")
	public void user_clicks_on_add_to_cart_button_for_health_book() {
	   driver.findElement(By.xpath("//a[text()='Health Book']/../..//input")).click();
	}

}
