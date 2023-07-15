package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    @FindBy(how = How.XPATH, using = "")
    public static WebElement btn;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager web = WebDriverManager.chromedriver();
        web.setup();
        ChromeDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.demoblaze.com/#");


        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(20));

        WebElement btn = dr.findElement(By.id("login2"));
        wait.until(ExpectedConditions.visibilityOf(btn));
        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();

        WebElement username = dr.findElement(By.id("loginusername"));
        wait.until(ExpectedConditions.visibilityOf(username));
        wait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys("tahuyhoang");

        WebElement password = dr.findElement(By.id("loginpassword"));
        wait.until(ExpectedConditions.visibilityOf(password));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("123456789");

        WebElement login = dr.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        wait.until(ExpectedConditions.visibilityOf(login));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();
        Thread.sleep(2000);

        WebElement samsungs6 = dr.findElement(By.linkText("Samsung galaxy s6"));
        wait.until(ExpectedConditions.visibilityOf(samsungs6));
        wait.until(ExpectedConditions.elementToBeClickable(samsungs6));
        samsungs6.click();
        Thread.sleep(3000);

        // In thông tin khi click vào Samsung galaxy s6
        String samsungs6label = dr.findElement(By.xpath("//div[@class='col-md-7 col-sm-12 col-xs-12']//h2[@class='name' and text()='Samsung galaxy s6']")).getText();
        System.out.println(samsungs6label);

        String pricesamsungs6 = dr.findElement(By.xpath("//div[@class='col-md-7 col-sm-12 col-xs-12']//h3[@class='price-container']")).getText();
        System.out.println(pricesamsungs6);

        String samsungs6des = dr.findElement(By.xpath("//div[@id='myTabContent']//div[@id='more-information']")).getText();
        System.out.println(samsungs6des);


        WebElement addsamsung = dr.findElement(By.linkText("Add to cart"));
        wait.until(ExpectedConditions.visibilityOf(addsamsung));
        wait.until(ExpectedConditions.elementToBeClickable(addsamsung));
        addsamsung.click();
        Thread.sleep(2000);

        dr.switchTo().alert().accept();
        Thread.sleep(1000);

        WebElement cart = dr.findElement(By.linkText("Cart"));
        wait.until(ExpectedConditions.visibilityOf(cart));
        wait.until(ExpectedConditions.elementToBeClickable(cart));
        cart.click();
        Thread.sleep(3000);

        WebElement delete = dr.findElement(By.linkText("Delete"));
        wait.until(ExpectedConditions.visibilityOf(delete));
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        delete.click();
        Thread.sleep(3000);

        WebElement home = dr.findElement(By.xpath("//a[@class='nav-link' and @href='index.html']"));
        wait.until(ExpectedConditions.visibilityOf(home));
        wait.until(ExpectedConditions.elementToBeClickable(home));
        home.click();
        Thread.sleep(3000);

        WebElement nokialumia = dr.findElement(By.linkText("Nokia lumia 1520"));
        wait.until(ExpectedConditions.visibilityOf(nokialumia));
        wait.until(ExpectedConditions.elementToBeClickable(nokialumia));
        nokialumia.click();
        Thread.sleep(3000);

        WebElement addnokialumia = dr.findElement(By.linkText("Add to cart"));
        wait.until(ExpectedConditions.visibilityOf(addnokialumia));
        wait.until(ExpectedConditions.elementToBeClickable(addnokialumia));
        addnokialumia.click();
        Thread.sleep(2000);

        dr.switchTo().alert().accept();
        Thread.sleep(1000);

        WebElement cartnokialumia = dr.findElement(By.linkText("Cart"));
        wait.until(ExpectedConditions.visibilityOf(cartnokialumia));
        wait.until(ExpectedConditions.elementToBeClickable(cartnokialumia));
        cartnokialumia.click();
        Thread.sleep(3000);

        WebElement placeOrder = dr.findElement(By.xpath("//div[@class='col-lg-1']//button[@type='button']"));
        wait.until(ExpectedConditions.visibilityOf(placeOrder));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrder));
        placeOrder.click();
        Thread.sleep(2000);

        WebElement name = dr.findElement(By.id("name"));
        wait.until(ExpectedConditions.visibilityOf(name));
        wait.until(ExpectedConditions.elementToBeClickable(name));
        name.sendKeys("Ta Huy Hoang");
        Thread.sleep(1000);

        WebElement country = dr.findElement(By.id("country"));
        wait.until(ExpectedConditions.visibilityOf(country));
        wait.until(ExpectedConditions.elementToBeClickable(country));
        country.sendKeys("Viet Nam");
        Thread.sleep(1000);

        WebElement close = dr.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-secondary']"));
        wait.until(ExpectedConditions.visibilityOf(close));
        wait.until(ExpectedConditions.elementToBeClickable(close));
        close.click();
        Thread.sleep(2000);

        //Navbar
//        WebElement home = dr.findElement(By.xpath("//div//ul//li[@class='nav-item active']/a"));
//        System.out.println("Home");
//
//        WebElement contact = dr.findElement(By.xpath("//div//ul//li[2][@class='nav-item']"));
//        System.out.println("Contact");
//
//        WebElement aboutus = dr.findElement(By.xpath("//div//ul//li[3][@class='nav-item']"));
//        System.out.println("About us");
//
//        WebElement cart = dr.findElement(By.xpath("//div//ul//li[4][@class='nav-item']"));
//        System.out.println("Cart");
//
//        WebElement login = dr.findElement(By.xpath("//div/ul/li/a[@id='login2']"));
//        System.out.println("Login");
//
//        WebElement signup = dr.findElement(By.xpath("//div/ul/li/a[@id='signin2']"));
//        System.out.println("Sign up");

        //Advertising
//        WebElement previouspage = dr.findElement(By.xpath("//div[@id='carouselExampleIndicators']/a/span[text()='Previous']"));
//        System.out.println("Previous Page");
//
//        WebElement samsungimg = dr.findElement(By.xpath("//div[@id='carouselExampleIndicators']//img[@src='Samsung1.jpg']"));
//        System.out.println("Samsung img");
//
//        WebElement nexusimg = dr.findElement(By.xpath("//div[@id='carouselExampleIndicators']//img[@src='nexus1.jpg']"));
//        System.out.println("Nexux img");
//
//        WebElement iphoneimg = dr.findElement(By.xpath("//div[@id='carouselExampleIndicators']//img[@src='iphone1.jpg']"));
//        System.out.println("Iphone img");
//
//        WebElement nextspage = dr.findElement(By.xpath("//div[@id='carouselExampleIndicators']/a/span[text()='Next']"));
//        System.out.println("Next Page");

        //Categories
//        WebElement categories = dr.findElement(By.xpath("//div[@class='list-group']/a[text()='CATEGORIES']"));
//        System.out.println("Categories");
//
//        WebElement phones = dr.findElement(By.xpath("//div[@class='list-group']/a[text()='Phones']"));
//        System.out.println("Phones");
//
//        WebElement laptops = dr.findElement(By.xpath("//div[@class='list-group']/a[text()='Laptops']"));
//        System.out.println("Laptops");
//
//        WebElement monitors = dr.findElement(By.xpath("//div[@class='list-group']/a[text()='Monitors']"));
//        System.out.println("Monitors");

        //Product
//        WebElement productpicure = dr.findElement(By.xpath("//div[@id='tbodyid']//div[@class='col-lg-4 col-md-6 mb-4']/div[@class='card h-100']/a/img[@src='imgs/Lumia_1520.jpg']"));
//        System.out.println("Product Img (Nokia Lumia 1520)");
//
//        WebElement title = dr.findElement(By.xpath("//div[@id='tbodyid']//div[@class='col-lg-4 col-md-6 mb-4']//div[@class='card-block']/h4[@class='card-title']/a[text()='Nokia lumia 1520']"));
//        System.out.println("Nokia lumia 1520");
//
//        WebElement price = dr.findElement(By.xpath("//div[@id='tbodyid']//div[@class='col-lg-4 col-md-6 mb-4']//div[@class='card-block']/h5[text()='$820']"));
//        System.out.println("$820");
//
//        WebElement des = dr.findElement(By.xpath("//div[@id='tbodyid']//div[@class='col-lg-4 col-md-6 mb-4']//div[@class='card h-100']//div[@class='card-block']/p[text()='The Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.  ']"));
//        System.out.println("Description");

        //Click Login
//        WebElement login = dr.findElement(By.id("login2"));
//        login.click();

        //Click Signup
//        WebElement signup = dr.findElement(By.id("signin2"));
//        signup.click();

        //Click Product
//        WebElement product = dr.findElement(By.name("hrefch"));
//        product.click();
    }
}