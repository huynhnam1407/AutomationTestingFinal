package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FinalProject {
    public static WebDriver edriver;

    public static WebDriverWait ewait;

    // Click Signup
    @FindBy(how = How.XPATH, using = "//div[@id='navbarExample']/ul[@class='navbar-nav ml-auto']/li[@class='nav-item']/a[@id='signin2' and text()='Sign up']")
    public WebElement signup2;
    // Điền Username cho Signup
    @FindBy(how = How.XPATH, using = "//div[@id='signInModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/form/div[@class='form-group']/input[@id='sign-username']")
    public WebElement signupusername;
    // Điền Password cho Signup
    @FindBy(how = How.XPATH, using = "//div[@id='signInModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-body']/form/div[@class='form-group']/input[@id='sign-password']")
    public WebElement signuppassword;
    // Click Signup trong Form đăng ký
    @FindBy(how = How.XPATH, using = "//div[@id='signInModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-footer']/button[@class='btn btn-primary' and text()='Sign up']")
    public WebElement btnsignup2;
    // Đóng form Đăng ký
    @FindBy(how = How.XPATH, using = "//div[@id='signInModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-footer']/button[@class='btn btn-secondary' and text()='Close']")
    public WebElement btnclosesignup2;
    @FindBy(how = How.XPATH, using = "//*[@id='login2']")
    public WebElement login2;
    @FindBy(how = How.XPATH, using = "//*[@id='loginusername']")
    public WebElement loginusername;
    @FindBy(how = How.XPATH, using = "//*[@id='loginpassword']")
    public WebElement loginpassword;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Log in')]")
    public WebElement btnlogin;
    @FindBy(how = How.XPATH, using = "//div[@class='card h-100']/div[@class='card-block']/h4[@class='card-title']/a[@href='prod.html?idp_=1' and text()='Samsung galaxy s6']")
    public WebElement samsungs6product;
    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-12 col-md-6 col-lg-6']/a[@href='#']")
    public WebElement productsamsung6add;
    @FindBy(how = How.XPATH, using = "//div[@id='navbarExample']/ul[@class='navbar-nav ml-auto']/li[@class='nav-item']/a[@class='nav-link' and @href='cart.html']")
    public WebElement productsamsungs6cart;
    @FindBy(how = How.XPATH, using = "//tbody[@id='tbodyid']/tr[@class='success']/td/a[text()='Delete']")
    public WebElement productsamsungs6delete;
    @FindBy(how = How.XPATH, using = "//div[@class='navbar-collapse']/ul[@class='navbar-nav ml-auto']/li[@class='nav-item active']/a[@class='nav-link' and @href='index.html']")
    public WebElement btnhome;
    @FindBy(how = How.XPATH, using = "//div[@class='card-block']/h4[@class='card-title']/a[@href='prod.html?idp_=2']")
    public WebElement productnokialumia;
    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-12 col-md-6 col-lg-6']/a[@class='btn btn-success btn-lg' and @href='#']")
    public WebElement productnokialumiaadd;
    @FindBy(how = How.XPATH, using = "//div[@class='navbar-collapse']/ul[@class='navbar-nav ml-auto']/li[@class='nav-item']/a[@class='nav-link' and text()='Cart']")
    public WebElement btncart;
    @FindBy(how = How.XPATH, using = "//div[@class='col-lg-1']/button[@type='button' and @class='btn btn-success']")
    public WebElement btnplaceorder;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='name']")
    public WebElement textnamefill;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='country']")
    public WebElement textcountryfill;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='city']")
    public WebElement textcityfill;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='card']")
    public WebElement textcardfill;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='month']")
    public WebElement textmonthfill;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/input[@type='text' and @id='year']")
    public WebElement textyearfill;
    @FindBy(how = How.XPATH, using = "//div[@id='orderModal']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-footer']/button[@type='button' and @class='btn btn-secondary']")
    public WebElement btnclose;
    @FindBy(how = How.XPATH, using = "//div[@class='navbar-collapse']/ul[@class='navbar-nav ml-auto']/li[@class='nav-item']/a[@id='logout2' and @href='#']")
    public WebElement btnlogout;

    public FinalProject(WebDriver driver) throws Exception {
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
        edriver.get("https://www.demoblaze.com/index.html");
        edriver.manage().window().maximize();
    }

    public void closeWeb() throws Exception {
        edriver.close();
    }

    public void waitUntilElementVisible(WebElement element) {
        int tryTimes = 0;
        while (tryTimes < 2) {
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se) {
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void waitUntilElementVisible(String path) {
        int tryTimes = 0;
        while (tryTimes < 2) {
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            } catch (StaleElementReferenceException se) {
                tryTimes++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void sendKeys(WebElement element, String text) throws InterruptedException {
        waitUntilElementVisible(element);
        element.sendKeys(text);
    }

    public void Alert(){
        edriver.switchTo().alert().accept();
    }

    public void gettextElement(WebElement element) {
        System.out.println(element.getText());
    }


}


