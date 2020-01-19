import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myUrl = "www.leafground.com/pages/Button.html";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Window.html");//.........
		String mainWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("color")).click();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		String secondWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.switchTo().window(mainWindow);
	
	}
}
