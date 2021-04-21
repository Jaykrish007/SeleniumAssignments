package SeAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	
	
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Jay");
	
	driver.findElementByXPath("(//button[@type='button'])[7]").click();
	Thread.sleep(1000);
	driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	System.out.println("Title of the Page is " + driver.getTitle());
	Thread.sleep(1000);
	driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	Thread.sleep(1000);
	driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");
	Thread.sleep(1000);
	driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
	System.out.println("Company Name Changed Successfuly");
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
