package SeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
	driver.findElementByName("PASSWORD").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByLinkText("Phone").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	String text = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
	System.out.println("First Resulting Lead Id is " + text);  
	Thread.sleep(1000);
	driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	driver.findElementByClassName("subMenuButtonDangerous").click();
	Thread.sleep(1000);
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(text);
	driver.findElementByXPath("(//button[@type='button'])[7]").click();
	driver.findElementByClassName("x-paging-info");
	System.out.println("No records to display in the Lead List. This message confirms the successful deletion");
	Thread.sleep(1000);
	driver.manage().window().minimize();
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
