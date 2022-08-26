package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProjectSpecificMethods{

	public ChromeDriver driver;
	@Given("Launch the chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		
		@And("Load the URL and Maximize")
		public void LoadAndMax() {
			driver.get("http:/leaftaps.com/opentaps");
			driver.manage().window().maximize();
		}
		@Given("Type the username as(string}")
		public void typeusername(String username) {
			driver.findElement(By.id("username")).sendKeys(username);
		}
		
		@And("Type the password as(string}")
		public void typeUsername(String password) {
			driver.findElement(By.id("password")).sendKeys(password);
		}
		
		@When("click the login button ")
		public void clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		
		@Then("Verify the home page is displayed")
		public void verifyHomepage() {
			String text=driver.findElement(By.tagName("h2")).getText();
			if(text.contains("welcome"))
			{
				System.out.println("Homepage");
			}
			else
			{
				System.out.println("Homepage not displayed");
			}		
		}
}

