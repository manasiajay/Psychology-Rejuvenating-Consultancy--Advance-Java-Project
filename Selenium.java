package co.edureka.selenium.demo;
import org.openda. selenium.By;
import org.openga.selenium.WebDriver;
import org.openda. selenium.chrome.ChromeDriver;
public class Selenium {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manasi folder\\zips_jars_exel\\Exe Files");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com/");
	driver.manage().window() .maximize();
	driver.findElement(By.id("identifierId")). sendKey("manasi20@gmail.com");
	driver.findElement(By.className("Cwak9")).click();
	String at = driver.getTitle();
	String et = "gmail";
	driver.close();

	if(at.equalsIgnoreCase(et))
	{

	System.out.println("Test Successful");
	}
	else
	{
	System.out.println("Failed");
	}
}
}