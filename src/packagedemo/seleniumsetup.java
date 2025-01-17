package packagedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class seleniumsetup {

	 public static void main(String[] args) {
	        // Set the path for the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", 
	            "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAselenium\\server\\chromedriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the desired URL
	        driver.navigate().to("https://www.google.com");
	        driver.manage().window().maximize();

	        // Wait until a specific element is visible (example element ID used)
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
	        } catch (Exception e) {
	            System.out.println("Element not found: " + e.getMessage());
	        }

	        // Fetch and print page title and current URL
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title is: " + pageTitle);

	        String currentUrl = driver.getCurrentUrl();
	        System.out.println("Page URL is: " + currentUrl);

	        // Pause execution for demonstration purposes
	        try {
	            Thread.sleep(9000); // 9 seconds (not 90 seconds)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
	}