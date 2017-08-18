import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		Select s= new Select (driver.findElement(By.name("passCount")));
		s.selectByValue("1");
		s.selectByValue("2");
		s.selectByValue("3");
		s.selectByValue("4");
		
		Select s1= new Select (driver.findElement(By.name("fromPort")));
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		s1.selectByIndex(4);
		s1.selectByIndex(5);
		s1.selectByIndex(6);
		s1.selectByIndex(7);
		s1.selectByIndex(8);
		s1.selectByIndex(9);
	}

}
