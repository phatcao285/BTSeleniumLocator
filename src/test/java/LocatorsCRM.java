import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.time.Duration;

public class LocatorsCRM {
    //Login Form
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputMissingEmail = "//form/div[normalize-space()='The Email Address field is required.']";
    public static String inputMissingPassword = "//form/div[normalize-space()='The Password field is required.']";
    public static String alertInvalidEmailorPassword = "//div[normalize-space()='Invalid email or password' and @class='text-center alert alert-danger']";
    public static String checkboxRememberme = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String buttonLogin = "//button[@type='submit']";
    // Navbar element
    public static String inputSearchNavbar = "//input[@id='search_input']";
    public static String hideMenu = "//div[contains(@class,'hide-menu')]/descendant::i";
    public static String imageProfile = "//ul[contains(@class,'dropdown-menu animated fadeIn')]/preceding-sibling::a//img";
    public static String dropdownProfile = "//ul[contains(@class,'dropdown-menu')]//a[normalize-space()='My Profile']";
    public static String dropdownTimeSheets = "//ul[contains(@class,'dropdown-menu')]//a[normalize-space()='My Timesheets']";
    public static String dropdownEditProfile = "//ul[contains(@class,'dropdown-menu')]//a[normalize-space()='Edit Profile']";
    public static String dropdownLanguage = "//ul[contains(@class,'dropdown-menu')]//a[normalize-space()='Language']";
    public static String dropdownLogout = "//ul[contains(@class,'dropdown-menu')]//a[normalize-space()='Logout']";
    // Index of page. Catch all category CRM
    public static String categoryDashboard = "//span[normalize-space()='Dashboard' and @class='menu-text']";
    public static String categoryCustomer = "//span[normalize-space()='Customers' and @class='menu-text']";
    public static String categorySales = "//span[normalize-space()='Sales' and @class='menu-text']";
    public static String categorySubcriptions = "//span[normalize-space()='Subscriptions' and @class='menu-text']";
    public static String categoryExpenses = "//span[normalize-space()='Expenses' and @class='menu-text']";
    public static String categoryContracts = "//span[normalize-space()='Contracts' and @class='menu-text']";
    public static String categoryProjects = "//span[normalize-space()='Projects' and @class='menu-text']";
    public static String categoryTasks = "//span[normalize-space()='Tasks' and @class='menu-text']";
    public static String categorySupport = "//span[normalize-space()='Support' and @class='menu-text']";
    public static String categoryLeads = "//span[normalize-space()='Leads' and @class='menu-text']";
    public static String categoryEstimateRequest = "//span[normalize-space()='Estimate Request' and @class='menu-text']";
    public static String categoryKnowledgeBase = "//span[normalize-space()='Knowledge Base' and @class='menu-text']";
    public static String categoryUtilities = "//span[normalize-space()='Utilities' and @class='menu-text']";
    public static String categoryReports = "//span[normalize-space()='Reports' and @class='menu-text']";
    //Catch all child category Sales
    public static String subCategoryProposals = "//span[normalize-space()='Proposals' and @class='sub-menu-text']";
    public static String subCategoryEstimates = "//span[normalize-space()='Estimates' and @class='sub-menu-text']";
    public static String subCategoryInvoices = "//span[normalize-space()='Invoices' and @class='sub-menu-text']";
    public static String subCategoryPayments = "//span[normalize-space()='Payments' and @class='sub-menu-text']";
    public static String subCategoryCreditNotes = "//span[normalize-space()='Credit Notes' and @class='sub-menu-text']";
    public static String subCategoryItems = "//span[normalize-space()='Items' and @class='sub-menu-text']";
    // Catch all sub-category Utilities
    public static String subCategoryMedia = "//a/span[normalize-space()='Media' and @class='sub-menu-text']";
    public static String subCategoryBulkPDFExport = "//a/span[normalize-space()='Bulk PDF Export' and @class='sub-menu-text']";
    public static String subCategoryCalendar = "//a/span[normalize-space()='Calendar' and @class='sub-menu-text']";
    // Catch all sub-category Reports
    public static String subCategorySales = "//li[contains(@class,'item-sales-reports')]//span";
    public static String subCategoryReports = "//li[contains(@class,'item-expenses-reports')]//span";
    public static String subCategoryEpenseIncome = "//li[contains(@class,'expenses-vs-income')]//span";
    public static String subCategoryLeads = "//li[contains(@class,'leads-reports')]/descendant::span";
    public static String subCategoryTimesheets = "//li[contains(@class,'timesheets-reports')]/child::a/child::span";
    public static String subCategoryKBArticles = "//li[contains(@class,'base-reports')]/child::a/child::span";
    // Catch element Customer
    public static String buttonNewCustomer = "//div[@class='_buttons']/descendant::a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//div[@class='_buttons']/descendant::a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//div[@class='_buttons']/descendant::a[normalize-space()='Contacts']";
    // Catch element Customers Summary
    public static String headerCsSummary = "//span[normalize-space()='Customers Summary']";
    public static String headerTotalCustomers = "//span[normalize-space()='Total Customers']";
    public static String headerActiveCustomers = "//span[normalize-space()='Active Customers']";
    public static String headerInactiveCustomers = "//span[normalize-space()='Inactive Customers']";
    public static String headerActiveContacts = "//span[normalize-space()='Active Contacts']";
    public static String headerInactivesContacts = "//span[normalize-space()='Inactive Contacts']";
    public static String headerContactsLogged = "//span[contains(text(),'Contacts Logged In Today')]";
    public static String inputSearchCsSummary = "//span[contains(@class,'input-group-addon')]/following-sibling::input";
    // Catch element New Customer
    public static String tabCustomerDetails = "//a[contains(normalize-space(),'Customer Details')]";
    public static String tabBillingandShipping = "//a[normalize-space()='Billing & Shipping']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsites = "//input[@id='website']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipcode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']]";
    public static String searchCountry = "//button[@data-id='country']/following-sibling::div/div/input";
    public static String dropdownGroups = "//div[contains(@app-field-wrapper,'groups_in')]";
    public static String searchInputGroups = "//button[contains(@data-id,'groups_in')]/following-sibling::div//input";
    public static String dropdownCurrency = "//select[@id='default_currency']/following-sibling::button";
    public static String searchCurrency = "//button[@data-id='default_currency']/following-sibling::div//div/descendant::input";
    public static String dropdownLanguageCustomers = "//button[@data-id='default_language']";
    public static String missingInputCompany = "//input[@id='company']/following-sibling::p";
    public static String buttonAddGroups = "//div[contains(@class,'input-group-btn')]/child::a";
    public static String inputAddGroups = "//label[@for='name']/parent::div/input[@id='name']";
    public static String buttonSaveGroups = "//div[@class='modal-footer']/child::button[@group='submit']";
    public static String buttonSaveandCreate = "//button[normalize-space()='Save and create contact']";
    // Projects
    public static String buttonNewProject = "//a[normalize-space()='New Project']";
    public static String buttonGanttChart = "//a[contains(@data-title,'Gantt')]";
    public static String searchProjects ="//div[contains(@class,'input-group')]/descendant::input[@aria-controls='projects']";
    public static String buttonExport ="//span[normalize-space()='Export']";
    public static String buttonReload ="//button[@data-original-title='Reload']";
    public static String buttonProjectLengths="//div[@id='projects_length']/descendant::select";
    public static String buttonFilter = "//div[@class='tw-inline pull-right']/descendant::button";
    //New Projects
    public static String tabProject = "//div[@class='horizontal-tabs']/descendant::li[@class='active']/descendant::a";
    public static String tabPSettings = "//a[normalize-space()='Project Settings']";
    public static String inputPN= "//div[@app-field-wrapper='name']/child::input";
    public static String inputCustomer = "//select[@id='clientid']/following-sibling::button";
    public static String inputMissingPN="//input[@id='name']/following-sibling::p";
    public static String inputMissingCustomer="//p[@id='clientid-error']";
    public static String checkboxCalculate = "//div[@class='checkbox checkbox-success']/child::input";
    public static String sliderP ="//span[@tabindex='0']/parent::div";
    public static String dropdownBillingType = "//select[@name='billing_type']/parent::div";
    public static String dropdownStatus = "//select[@name='status']/parent::div";
    public static String inputEstimatedHours = "//div[@app-field-wrapper='estimated_hours']/descendant::input";
    public static String dropdownMembers = "//select[contains(@id,'project_members')]/parent::div";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String inputDeadline ="//input[@id='deadline']";
    public static String inputTag = "//input[@placeholder='Tag']";
    public static String buttonFile ="//textarea[@id='description']/following::span[contains(.,'File')]";
    public static String buttonEdit ="//textarea[@id='description']/following::span[contains(.,'Edit')]";
    public static String buttonView = "//textarea[@id='description']/following::span[contains(.,'View')]";
    public static String buttonInsert ="//textarea[@id='description']/following::span[contains(.,'Insert')]";
    public static String buttonFormat ="//textarea[@id='description']/following::span[contains(.,'Format')]";
    public static String buttonTools ="//textarea[@id='description']/following::span[contains(.,'Tools')]";
    public static String buttonTable ="//textarea[@id='description']/following::span[contains(.,'Table')]";
    public static String checkboxSendPcreatedE= "//label[normalize-space()='Send project created email']";
    public static String buttonSaveProject ="//button[normalize-space()='Save']";
    public static void main(String[] args) {

    }
}
