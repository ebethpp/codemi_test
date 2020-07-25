package stepdefinitions;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.baseutil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook extends baseutil  {
	private baseutil base;

	public hook(baseutil base) {
		this.base = base;
	}

	@Before
	public void InitializeTest(Scenario scenario) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
		base.driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
//		base.driver = new ChromeDriver();
	}

	@After
	public void TearDownTest(Scenario scenario) {
		if (scenario.isFailed()) {
			// Take screenshot
			System.out.println(scenario.getName());
		}

		System.out.println("Closing the browser : Firefox");
		base.driver.close();
	}
}
