package DropDownSelectClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownScreenshot {
	
	static WebDriver driver;
	
	private static void method10(String a) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\DropDownscreenshot1\\"+a+".png");
		FileUtils.copyFile(screenshotAs, f);

	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//a[@rel='async'][1]"));
		element.click();
		Thread.sleep(3000);
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
		method10("facebook");
		
		
		
		
	}
	

}
