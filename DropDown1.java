package DropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//is Multiple and Get Options Method

public class DropDown1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@rel='async']"));
		
		element.click();
		Thread.sleep(3000);
		
		     //Month Drop Down
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select s= new Select(Month);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		Select se=new Select(Month);
		List<WebElement> options = se.getOptions();
		System.out.println(options);
		for (WebElement webElement : options) {
        System.out.println(webElement.getText());
		}
			//Date DropDown
			
			WebElement Date= driver.findElement(By.id("day"));
			Select M=new Select(Date);
			
		    boolean multiple2 = M.isMultiple();
			System.out.println(multiple2);
			
			Select mm=new Select(Date);
			List<WebElement> options2 = mm.getOptions();
			System.out.println(options2);
			for (WebElement webElement : options2) {
				System.out.println(webElement.getText());
				
			}
			
			//Year DropDown
			
			WebElement Year1 = driver.findElement(By.name("birthday_year"));
				Select Y=new Select(Year1);
						boolean multiple3 = Y.isMultiple();
				System.out.println(multiple3);
				
				Select yy =new Select(Year1);
				List<WebElement> options3 = yy.getOptions();
				System.out.println(options3);
				for (WebElement webElement : options3) {
					System.out.println(webElement.getText());
					
				}
				
						
			}
		}
	


