package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://127.0.0.1:8000/accounts/login";
        String expectedTitle ="Login";
        driver.get(baseUrl);
        String actualTitle =driver.findElement(By.className("log-title")).getText();
        if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("Login frame title is : "+actualTitle);
        	driver.findElement(By.id("input")).clear();
        	driver.findElement(By.id("input")).sendKeys("test@gmail.com");
        	driver.findElement(By.name("password")).clear();
        	driver.findElement(By.name("password")).sendKeys("123456");
        	//driver.findElement(By.className("check-box")).click();
        	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[4]/button")).click();
        	System.out.println("Login successful");
        	if (driver.getTitle().equals("Gatherly Social Network Toolkit")) {
        		System.out.println("Login Test case passed and it is redirected to Home page");
        	}
        	else
        		System.out.println("Login failed");




        }
	}

}
