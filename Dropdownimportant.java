package DropDownSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownimportant {
  static WebDriver driver;
  private static void browser() {
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
}
  
  private static void selectIndex(WebElement index,int ind) {
	  Select s= new Select(index);
	  s.selectByIndex(ind);
	  
}
  
  public static void main(String[] args) throws InterruptedException {
	browser();
	WebElement element = driver.findElement(By.xpath("//a[@rel='async'][1]"));
	element.click();
	Thread.sleep(3000);
	
	WebElement element2 = driver.findElement(By.name("firstname"));
	element2.sendKeys("Kamatchi");
	
	selectIndex(driver.findElement(By.id("month")), 3);
	
}
}
