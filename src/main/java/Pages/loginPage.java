package Pages;

import org.openqa.selenium.By;

import Base.Initialize;

public class loginPage extends Initialize {
	public static void relationship(String input) {
		driver.findElement(By.xpath("//input[@name='gparent1']")).sendKeys(input);
	}
}
