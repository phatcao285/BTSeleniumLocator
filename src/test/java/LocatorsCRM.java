import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.time.Duration;

public class LocatorsCRM {
    public String inputEmail = "//input[@id='email']";
    public String inputPassword = "//*[@class='form-control' and @id='password']";
    public String checkRemeberMe = "//label[normalize-space()='Remember me']";
    public String LoginButton ="//button[contains(@class,'btn')]";
    public String ForgetPassword = "//a[starts-with(normalize-space(),'Forgot')]";
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Login CRM");
        System.out.println("======================================");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

       LocatorsCRM locatorsCRM = new LocatorsCRM();

       // Input email and password
       driver.findElement(By.xpath(locatorsCRM.inputEmail)).sendKeys("admin@example.com");
       Thread.sleep(3000);
       driver.findElement(By.xpath(locatorsCRM.inputPassword)).sendKeys("123456");
       Thread.sleep(3000);

       // Check label Rememember me
        driver.findElement(By.xpath(locatorsCRM.checkRemeberMe)).click();
        Thread.sleep(3000);

        // Check Forget password
//        driver.findElement(By.xpath(locatorsCRM.ForgetPassword)).click();
//        Thread.sleep(3000);
//        driver.quit();

        //Click Button to Submit
        driver
    }
}
