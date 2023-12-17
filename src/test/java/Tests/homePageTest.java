package Tests;

import org.testng.annotations.Test;

import Base.Initialize;

public class homePageTest extends Initialize{
	@Test
	public void testLogin() {
		initDriver("https://only-testing-blog.blogspot.com/?fname=&lname=");
		System.out.println("This is in login test II");
	}
}
