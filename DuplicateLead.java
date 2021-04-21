package SeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("@gmail.com");

		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(1000);
		String text = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println("First Resulting Lead Name is :" + text);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title = driver.getTitle();
		System.out.println("The Title is " + title);
		driver.findElementByClassName("smallSubmit").click();

		driver.manage().window().minimize();
		driver.close();
	}
}
