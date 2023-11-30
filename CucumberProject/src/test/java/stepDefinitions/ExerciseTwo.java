package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExerciseTwo {

	public WebDriver driver;
	public WebDriverManager manager;

	@Given("test the Login functionality with empty input fields")
	public void test_the_login_functionality_with_empty_input_fields() {
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
		manager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qamoviesapp.ccbp.tech/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@When("user enters with correct username and wrong password")
	public void user_enters_with_correct_username_and_wrong_password() {
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("12345");
		driver.get("https://qamoviesapp.ccbp.tech/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@When("user enter both correct details of username and password")
	public void user_enter_both_correct_details_of_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("rahul@2021");
		driver.get("https://qamoviesapp.ccbp.tech/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	}

	@When("user click Login")
	public void user_click_login() {
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
		// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();

	driver.close();
	}
}
