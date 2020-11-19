package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class feature1Def {
	public WebDriver driver;
	
	@Given("user should have lanched site to test")
	public void user_should_have_lanched_site_to_test() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com");
	}

	@When("valid details are entered")
	public void valid_details_are_entered() {
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("manipal822@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("manipal123");
	}

	@When("clicked on login button")
	public void clicked_on_login_button() {
		driver.findElement(By.xpath("//input[@type= 'submit' and @value='Log in']")).click();
	}

	@Then("home screen should be displayed")
	public void home_screen_should_be_displayed() {
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);
	}


}
