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
    public String LoginButton = "//button[contains(@class,'btn')]";
    public String ForgetPassword = "//a[starts-with(normalize-space(),'Forgot')]";
    public String customerMenu = "//span[normalize-space()='Customers']/ancestor::a";
    public String buttonAddCustomer = "//div[@class='_buttons']/descendant::a[normalize-space()='New Customer']";
    public String inputCompany= "//label[contains(normalize-space(),'Phone')]/preceding::div[contains(@class,'form-group')]/descendant::input[@id='company']";
    public String inputVAT="//label[@for='company']/following::div[contains(@class,'form-group')]//label[contains(text(),'VAT Number')]/ancestor::div/descendant::input[@name='vat']";
    public String inputPhone = "//label[normalize-space()='Phone']/following-sibling::input";
    public String inputWebsite = "//label[@for='website']/following-sibling::input";
    public String buttonAddGroups = "//div[contains(@class,'input-group-btn')]/child::a";
    public String inputAddGroups = "//label[@for='name']/parent::div/input[@id='name']";
    public String buttonSaveGroups = "//div[@class='modal-footer']/child::button[@group='submit']";
    public String inputAddress = "//label[@for='address']/following-sibling::textarea";
    public String inputCity = "//div[@app-field-wrapper='state']/preceding-sibling::div/input[@id='city']";
    public String inputState ="//div[@app-field-wrapper='state']/child::input" ;
    public String inputZip = "//div[@app-field-wrapper='zip']//descendant::input";
    public String dropdownCountry ="//div[@class='filter-option-inner-inner'][ancestor::div[@app-field-wrapper='country']]";
    public String selectCoutry ="//span[normalize-space()='Vietnam']";
    public String buttonSave = "//button[normalize-space()='Save and create contact']//following-sibling::button";
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
        driver.findElement(By.xpath(locatorsCRM.LoginButton)).click();
        Thread.sleep(3000);

        //Trang CRM
        //Click to Customer Menu
        driver.findElement(By.xpath(locatorsCRM.customerMenu)).click();
        Thread.sleep(3000);
        // Catch button add Menu Customer
        driver.findElement(By.xpath(locatorsCRM.buttonAddCustomer)).click();
        Thread.sleep(3000);
        //Catch Element Company
        driver.findElement(By.xpath(locatorsCRM.inputCompany)).sendKeys("Tesla");
        Thread.sleep(3000);
        //Catch element VATnumber
        driver.findElement(By.xpath(locatorsCRM.inputVAT)).sendKeys("007799444");
        Thread.sleep(3000);
        // Catch element Phone
        driver.findElement(By.xpath(locatorsCRM.inputPhone)).sendKeys("0817878349");
        Thread.sleep(3000);
        //Catch element websites
        driver.findElement(By.xpath(locatorsCRM.inputWebsite)).sendKeys("https://chatgpt.com/");
        Thread.sleep(3000);
        // Catch button add Groups
        driver.findElement(By.xpath(locatorsCRM.buttonAddGroups)).click();
        Thread.sleep(3000);
        // Catch input Add Groups
        driver.findElement(By.xpath(locatorsCRM.inputAddGroups)).sendKeys("Leon Scott Kenedy Group");
        Thread.sleep(3000);
        // Catch button Save Group
        driver.findElement(By.xpath(locatorsCRM.buttonSaveGroups)).click();
        Thread.sleep(3000);
        // Catch input address
        driver.findElement(By.xpath(locatorsCRM.inputAddress)).sendKeys("48/4 Le Chi Dan street");
        Thread.sleep(3000);
        // Catch input city
        driver.findElement(By.xpath(locatorsCRM.inputCity)).sendKeys("Thu Dau Mot");
        Thread.sleep(3000);
        // Catch input State
        driver.findElement(By.xpath(locatorsCRM.inputState)).sendKeys("Binh Duong");
        Thread.sleep(3000);
        // Catch input Zip
        driver.findElement(By.xpath(locatorsCRM.inputZip)).sendKeys("65000");
        Thread.sleep(3000);
        // Catch div Country
        driver.findElement(By.xpath(locatorsCRM.dropdownCountry)).click();
        Thread.sleep(3000);
        // Select country
        driver.findElement(By.xpath(locatorsCRM.selectCoutry)).click();
        Thread.sleep(3000);
        // Save
        driver.findElement(By.xpath(locatorsCRM.buttonSave)).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
