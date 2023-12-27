package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.initConfig;
import Pages.homePage;

public class homeTest extends initConfig{
	homePage home;
	
	@BeforeGroups(groups = "SmokeTest")
	public void setupHomeTest() {
		home=new homePage();
	}
	
	@Test
	public void verifyHomePage() throws InterruptedException {
		home.verifyHomePage();
	}
	
	@Test(groups = "SmokeTest", priority = 2)
	public void verifyGroup() throws InterruptedException {
		System.out.println("Inside Group");
		verifyHomePage();
	}

}
