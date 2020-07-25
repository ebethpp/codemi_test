Feature: Post Tweet on Twitter

 Scenario: User should be able to post tweet on twitter
    Given User Launches the website
    Then User should be able to check login page
    Then User Click Login button on login page
  	And I enter the following for login
  		| username | password |
  		| testautomationcodemi@gmail.com   | Password@123	  |
  	And User click login button
    Then User should see the homepage
    Then User enter "Codemi is web based learning management system" on tweet
    Then User click on tweet button