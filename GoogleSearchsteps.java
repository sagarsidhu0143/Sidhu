package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchsteps {

	WebDriver driver = null;


	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/HP/Cucumberjav/Cucumberjava"
				+ "/src/test/resources/drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step -user is on google serach page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step -user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("LeelaManojchilaka");
		Thread.sleep(2000);
	}

	@And("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {
		System.out.println("Inside step -clicks on search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step -user is navigated to search results");
		driver.getPageSource().contains("leelaManoj chilaka - YouTube");
		driver.close();
		driver.quit();
	}
	
	@Given ("User navigate for Lenovo Laptop")
	public void User_navigate_for_Lenovo_Laptop() 
	{
		System.out.println("Given User navigate for Lenovo Laptop");
		
	}
	
	@When("Add the laptop to the basket")
	public void  Add_the_laptop_to_the_basket()
	{
		System.out.println("When Add the laptop to the basket");
		
	}
	
	@Then("User basket should display with added item")
	public void User_basket_should_display_with_added_item()
	{
		System.out.println("Then User basket should display with added item");
	}
	
   	@Given("I Navigate to the login page")
   	public void I_Navigate_to_the_login_page() 
   	{
   		System.out.println("I Navigate to the login page");
   	}
   	
   	@When("I submit username and password")
   	public void I_submit_username_and_password()
   	{
   		System.out.println("A");
   	}
   	
   	@Then("I should be logged in")
   	public void I_should_be_logged_in()
   	{
   		System.out.println("AA");	
   	}
}
