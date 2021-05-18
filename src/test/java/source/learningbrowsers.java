package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learningbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "D:\\seleniumbrowser\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\seleniumbrowser\\geckodriver.exe");
		
		//System.setProperty("webdriver.edge.driver", "D:\\seleniumbrowser\\msedgedriver.exe");
		
	  //  driver = new ChromeDriver();
	   // driver=new FirefoxDriver();
	    
	   // driver= new EdgeDriver();
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();	   
//	    driver.get("https://artoftesting.com");
//	    driver.manage().window().maximize();
//	    driver.close();
	    
//	    WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();	   
//	    driver.get("https://artoftesting.com");
//	    driver.manage().window().maximize();
//	    driver.close();s
	    
	    WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();	   
	    driver.get("https://artoftesting.com");
	    driver.manage().window().maximize();
	    driver.close();

	}

}
