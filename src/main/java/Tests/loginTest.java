package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import Base.initConfig;
import Pages.homePage;
import Pages.loginPage;

public class loginTest extends initConfig{	
	loginPage login;
	
	@BeforeGroups(groups = "SmokeTest")
	public void setupLoginTest() {
		initDriver("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login = new loginPage();
	}
	
	@Test(groups = "SmokeTest", priority = 1)
	public void Login() throws InterruptedException {
		login.loginToApp();
		Thread.sleep(3000);
	}
	
	@Test
	public void excludeTest() {
		System.out.println("Exclude");
	}
}
