package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pagesImplementations.Home;

public class OneImpl {

	public WebDriver driver;
	
	@Given("Navigate to Login Page")
	public void navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qamoviesapp.ccbp.tech/login");
	}
	@When("Enter the Valid Email")
	public void enter_the_valid_email() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("rahul");
	}
	@When("Enter the Valid Password")
	public void enter_the_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("rahul@2021");
	}
	@Then("Click the Login Button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.close();
	}
}
