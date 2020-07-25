package stepdefinitions;

import org.openqa.selenium.By;

import base.baseutil;
import cucumber.api.java.en.Then;

public class posttweetstep extends baseutil {
	private baseutil base;
	public posttweetstep( baseutil base) {
		this.base = base;
		
	}

	@Then("^User enter \"([^\"]*)\" on tweet$")
	public void user_enter_on_tweet(String tweet) throws Throwable {
	   base.driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div")).sendKeys(tweet);
	  Thread.sleep(2000); 
	}
	
	@Then("^User click on tweet button$")
	public void user_click_on_tweet_button() throws Throwable {
	   base.driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div[2]/div[3]")).click();
	   Thread.sleep(2000);
	}
	
	
}
