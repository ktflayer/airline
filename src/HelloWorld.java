import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World!!!");
		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.calafiaairlines.com/";
        String expectedTitle = "Calafia";
        String actualTitle = "";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        Thread.sleep(4000);
        driver.close();
        driver.quit();
	}

}
