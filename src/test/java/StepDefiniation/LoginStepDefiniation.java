package StepDefiniation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefiniation {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("^user enter the correct username as (.+) and password as (.+)$")
	public void user_enter_the_correct_username_as_and_password_as(String username, String password) throws Throwable {

	}

	// @When("user enter the correct username")
	// public void user_enter_the_correct_username() {
	// driver.findElement(By.name("username")).sendKeys("Admin");

	// }

	// @When("user enter the correct password")
//	public void user_enter_the_correct_password() {
	// driver.findElement(By.name("password")).sendKeys("admin123");
	// }

	// @When("user enter the correct username as {string}")
	// public void user_enter_the_correct_username_as(String Usern) {
	// driver.findElement(By.name("username")).sendKeys(Usern);

//	}

	// @When("user enter the correct password as {string}")
	// public void user_enter_the_correct_password_as(String Pass) {
	// Write code here that turns the phrase above into concrete actions
	// driver.findElement(By.name("password")).sendKeys(Pass);
	// }

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}

	@Then("user should be able to logged in successfully")
	public void user_should_be_able_to_logged_in_successfully() {
		System.out.println("user should be able to logged in successfully ");
		driver.quit();

	}

	// @When("user clicks on Forgot your password? link")
	// public void user_clicks_on_Forgot_your_password_link() {
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();

//	}

	// @Then("user should be redirected to Reset Password page")
	// public void user_should_be_redirected_to_Reset_Password_page() {
		// System.out.println("user should be redirected to Reset Password page ");
		// driver.quit();

	// }

}
