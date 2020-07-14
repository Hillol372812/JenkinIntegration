package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtendReprt {
	WebDriver driver;
	ExtentReports extend;

	@BeforeTest()
	public void Extendreport() {
		String path = System.getProperty("user.dir")+"\\reports\\extendreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Extend Report");
		reporter.config().setReportName("WebAutomation Extend Report");

		extend = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Reporter", "Hillol Mahata");
	}

	@Test
	public void LaunchFlipkart() {
		extend.createTest("LaunchFlipkart");
		System.setProperty("webdriver.chrme.driver",
				"C:\\Users\\Hillol\\Desktop\\Eclipse\\Gecko driver\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

		 Assert.assertTrue(false);
	}

	@Test
	public void LaunchFlipkart2() {
		extend.createTest("LaunchFlipkart2");
		System.setProperty("webdriver.chrme.driver",
				"C:\\Users\\Hillol\\Desktop\\Eclipse\\Gecko driver\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
       Assert.assertTrue(true);
		extend.flush();
	}

	@AfterMethod
	public void closebrowser() {
	
		driver.close();
	}

}
