Feature: Login Twitter

 Scenario: User should be able to login
    Given User Launches the website
    Then User should be able to check login page
    Then User Click Login button on login page
  	And I enter the following for login
  		| username | password |
  		| testautomationcodemi@gmail.com   | Password@123	  |
  	And User click login button
    Then User should see the homepage