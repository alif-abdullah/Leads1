import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

	}

}
