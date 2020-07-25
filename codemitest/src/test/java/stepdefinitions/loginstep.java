package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import base.baseutil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginstep extends baseutil {
	private baseutil base;
	
	public loginstep(baseutil base) {
		this.base = base;
	}
	
	@Given("^User Launches the website$")
	public void user_Launches_the_website() throws Throwable {
	   base.driver.navigate().to("https://www.twitter.com/");
	   Thread.sleep(5000);
	}
	
	@Then("^User should be able to check login page$")
	public void user_should_be_able_to_check_login_page() throws Throwable {
	   base.driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div/div/div[1]/div/a[2]")).isDisplayed();
	}

	@Then("^User Click Login button on login page$")
	public void user_Click_Login_button_on_login_page() throws Throwable {
		Thread.sleep(3000);
	   base.driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div/div/div[1]/div/a[2]")).click();
	}
	
	@Given("^I enter the following for login$")
	public void i_enter_the_following_for_login(DataTable table) throws Throwable {
	List<User> users = new ArrayList<User>();
		
		users=table.asList(User.class);
		for(User user: users) {
			base.driver.findElement(By.name("session[username_or_email]")).sendKeys(user.username);
			Thread.sleep(1000);
			base.driver.findElement(By.name("session[password]")).sendKeys(user.password);
			Thread.sleep(1000);
		}
	}
	
	public class User {
		public String username;
		public String password;
		
		public User(String Username, String Password) {
			Username = username;
			Password = password;
		}
	}
	
	@Then("^User click login button$")
	public void User_click_login_button() throws Throwable {
	   base.driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div")).click();
	   Thread.sleep(5000);
	}

	@Then("^User should see the homepage$")
	public void User_should_see_the_homepage() throws Throwable {
	   // base.driver.findElement(By.xpath("")).isDisplayed();
	}

	
}
