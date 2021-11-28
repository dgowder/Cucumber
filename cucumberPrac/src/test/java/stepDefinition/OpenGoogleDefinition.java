package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class OpenGoogleDefinition {
	
	
	WebDriver driver;

	@Given("^Open google\\.co\\.in$")
	public void open_google_co_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://google.co.in");
	}

	@When("^Search a \"([^\"]*)\"$")
	public void search_a(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.name("q")).sendKeys(searchTerm);
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 
	 
	}

	@Then("^Mobiles will be displaced$")
	public void mobiles_will_be_displaced() throws Throwable {
	   
        boolean status = driver.findElement(By.partialLinkText("mobi")).isDisplayed();
        if (status)
        {
        	System.out.println("Results Displayed");
        }
	}
}