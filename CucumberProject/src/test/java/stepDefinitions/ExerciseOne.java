package stepDefinitions;

//import org.cucumber.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExerciseOne {
	public WebDriver driver;
	public WebDriverManager manager;
	

	@Given("whether the website logo image is displayed")
	public void whether_the_website_logo_image_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		manager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qamoviesapp.ccbp.tech/login");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='login website logo']")).isDisplayed());

		
	}

	@When("whether the heading text is {string}")
	public void whether_the_heading_text_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText().equalsIgnoreCase(string));
	}

	@When("whether the Username label text is {string}")
	public void whether_the_username_label_text_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("//label[normalize-space()='USERNAME']")).getText().equalsIgnoreCase(string));
	}

	@When("whether the Password label text is {string}")
	public void whether_the_password_label_text_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("//label[normalize-space()='PASSWORD']")).getText().equalsIgnoreCase(string));
		
	}

	@Then("Test the Login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Login']")).getText().equalsIgnoreCase("Login"));
		driver.close();
	}


}
