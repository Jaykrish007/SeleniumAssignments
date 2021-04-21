package SeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
	 driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		
driver.findElementById("firstNameField").sendKeys("Jayakrishna");
driver.findElementById("lastNameField").sendKeys("duraiswamy");
driver.findElementById("createContactForm_firstNameLocal").sendKeys("Jay");
driver.findElementById("createContactForm_lastNameLocal").sendKeys("Krish");
driver.findElementById("createContactForm_departmentName").sendKeys("Selenium");
driver.findElementById("createContactForm_description").sendKeys("Worked in TCS for the past 1.5 years");
Thread.sleep(2000);
driver.findElementById("createContactForm_primaryEmail").sendKeys("jayk78908@gmail.com");	

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement findElement = driver.findElementById("createContactForm_generalStateProvinceGeoId");
Select dd = new Select(findElement);
//dd.selectByValue("NY");//select by value 
dd.selectByVisibleText("New York");//select by visible text

driver.findElementByClassName("smallSubmit").click();
driver.findElementByLinkText("Edit").click();
Thread.sleep(2000);
driver.findElementById("updateContactForm_description").clear();
	
driver.findElementById("updateContactForm_importantNote").sendKeys("Learning Selenium daily");
	
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	System.out.println("the Title is " + driver.getTitle());
	System.out.println("The code is Success");
	
driver.close();
}
}
