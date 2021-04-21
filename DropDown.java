package SeAssignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown
{
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
	
	driver.manage().window().maximize();
	
WebElement dd= driver.findElementByXPath("//select[@id='dropdown1']");
	Select cls= new Select(dd);
	//cls.selectByIndex(1);by index
    //cls.selectByVisibleText("Selenium");by visible text

	
	List<WebElement> options = cls.getOptions();//to get the dropdown options
	int size = options.size();
	int drop = size-1;
	
	System.out.println("The Dropdown options are :" + drop);
	
		
		driver.manage().window().minimize();
		
		driver.close();
		
		
	//dd.sendKeys("Selenium");//by sendkeys
	//cls.selectByValue("1");//by value
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
