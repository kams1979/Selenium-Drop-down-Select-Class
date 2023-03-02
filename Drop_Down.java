package DropDownSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().fullscreen();
	WebElement element = driver.findElement(By.xpath("(//a[@rel='async'])[1]"));
	element.click();
	Thread.sleep(2000);
	WebElement element2 = driver.findElement(By.name("firstname"));
	element2.sendKeys("Kamatchi");
	WebElement element3 = driver.findElement(By.name("lastname"));
	element3.sendKeys("Rajarun");
	WebElement element4 = driver.findElement(By.name("reg_email__"));
	element4.sendKeys("9940155509");
	WebElement element5 = driver.findElement(By.id("password_step_input"));
	element5.sendKeys("kavin2006");
	WebElement Date = driver.findElement(By.id("day"));
	Select D=new Select(Date);
	D.selectByValue("20");
	WebElement Month = driver.findElement(By.id("month"));
	Select s=new Select(Month);
	s.selectByIndex(3);
	WebElement Yr = driver.findElement(By.id("year"));
	Select y=new Select(Yr);
	y.selectByVisibleText("1979");
	WebElement Gender = driver.findElement(By.className("_58mt"));
	Gender.click();
	
}
}
