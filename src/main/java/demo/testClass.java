package demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testClass extends FinalProject {

    public WebDriver edriver;

    public WebDriverWait ewait;

    DataField dataField;
    public testClass() throws Exception{
        super(FinalProject.edriver);
        edriver = FinalProject.edriver;
        ewait = FinalProject.ewait;
        dataField = new DataField("src/main/java/demo/textClass.xlsx");
    }


    @Test
    public void test() throws Exception {
        // Click vào nút Signup
        waitUntilElementVisible(signup2);
        signup2.click();
        // Điền username trong Form Đăng ký (lấy dữ liệu từ Data Driven)
        waitUntilElementVisible(signupusername);
        try {
            Assert.assertTrue(signupusername.isDisplayed());
            System.out.println("Đăng ký Username thành công");
        } catch (Exception e) {
            System.out.println("Không đăng ký được Username");
        }
        sendKeys(signupusername, dataField.getData(0,0));
        // Điền password trong Form Đăng ký (lấy dữ liệu từ Data Driven)
        waitUntilElementVisible(signuppassword);
        sendKeys(signuppassword, dataField.getData(0,1));
        // Click vào nút Singup trên Form
        waitUntilElementVisible(btnsignup2);
        btnsignup2.click();
        ewait.until(ExpectedConditions.alertIsPresent());
        try {
            Alert alert = edriver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert text is " + alertText);
            Thread.sleep(1000);
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Không tìm thấy thông báo cảnh báo");
        }
        // Đóng nút Form Đăng ký
        Thread.sleep(1000);
        waitUntilElementVisible(btnclosesignup2);
        btnclosesignup2.click();
        Thread.sleep(1000);
        // Click vào nút Login
        waitUntilElementVisible(login2);
        login2.click();
        Thread.sleep(1000);
        // Điền Username bằng Data Driven và xuất kết quả bằng Assert true
        waitUntilElementVisible(loginusername);
        try {
            Assert.assertTrue(loginusername.isDisplayed());
            System.out.println("Login Username thành công");
        } catch (Exception e) {
            System.out.println("Login Username không thành công");
        }
        sendKeys(loginusername, dataField.getData(0,0));
        Thread.sleep(500);
        // Điền Password - Login
        waitUntilElementVisible(loginpassword);
        sendKeys(loginpassword, dataField.getData(0,1));
        System.out.println("Login Password thành công");
        waitUntilElementVisible(btnlogin);
        btnlogin.click();
        Thread.sleep(2000);

        // Samsung s6
        waitUntilElementVisible(samsungs6product);
        try {
            Assert.assertTrue(samsungs6product.isDisplayed());
            System.out.println("Click vào sản phầm Samsungs6 thành công");
        } catch (Exception e) {
            System.out.println("Không thể Click vào sản phẩm Samsungs6");
        }
        samsungs6product.click();
        Thread.sleep(1000);
        // Add to cart Samsung s6
        waitUntilElementVisible(productsamsung6add);
        System.out.println("Thêm sản phầm Samsungs6 thành công");
        productsamsung6add.click();
        Thread.sleep(1000);
        // Tắt Alert cho Samsung
        edriver.switchTo().alert().accept();
        // Cart cho Samsung
        waitUntilElementVisible(productsamsungs6cart);
        System.out.println("Truy cập Cart có hiển thị Samsungs6 thành công");
        productsamsungs6cart.click();
        Thread.sleep(2000);
        // Delete from cart
        waitUntilElementVisible(productsamsungs6delete);
        System.out.println("Xóa sản phầm Samsung s6 thành công");
        productsamsungs6delete.click();
        Thread.sleep(2000);
        // Trở về Home
        waitUntilElementVisible(btnhome);
        System.out.println("Trở về trang chủ thành công");
        btnhome.click();
        Thread.sleep(2000);
        // Nokia Lumia
        waitUntilElementVisible(productnokialumia);
        try {
            Assert.assertTrue(productnokialumia.isDisplayed());
            System.out.println("Click vào sản phầm Nokialumia thành công");
        } catch (Exception e) {
            System.out.println("Không thể Click vào sản phẩm Nokialumia");
        }
        productnokialumia.click();
        Thread.sleep(2000);
        // Add to cart Nokia Lumia
        waitUntilElementVisible(productnokialumiaadd);
        System.out.println("Thêm sản phẩm Nokialumia thành công");
        productnokialumiaadd.click();
        Thread.sleep(2000);
        // Tắt alert cho Nokia Lumia
        edriver.switchTo().alert().accept();
        Thread.sleep(500);
        // Cart cho Nokia Lumia
        waitUntilElementVisible(btncart);
        System.out.println("Bấm vào Cart thành công");
        btncart.click();
        Thread.sleep(2000);
        // Place Order Nokia Lumia
        waitUntilElementVisible(btnplaceorder);
        System.out.println("Click vào nút Place Order thành công");
        btnplaceorder.click();
        // Điền name
        waitUntilElementVisible(textnamefill);
        try {
            Assert.assertTrue(textnamefill.isDisplayed());
            System.out.println("Điền tên thành công");
        } catch (Exception e) {
            System.out.println("Không điền được tên");
        }
        sendKeys(textnamefill, dataField.getData(0,2));
        Thread.sleep(500);
        // Điền country
        waitUntilElementVisible(textcountryfill);
        sendKeys(textcountryfill, dataField.getData(1,2));
        System.out.println("Điền Country thành công");
        Thread.sleep(500);
        // Điền city
        waitUntilElementVisible(textcityfill);
        sendKeys(textcityfill, dataField.getData(2,2));
        System.out.println("Điền City thành công");
        Thread.sleep(500);
        // Điền Credit Card
        waitUntilElementVisible(textcardfill);
        sendKeys(textcardfill, dataField.getData(3,2));
        System.out.println("Điền Card thành công");
        Thread.sleep(500);
        // Điền Month
        waitUntilElementVisible(textmonthfill);
        sendKeys(textmonthfill, dataField.getData(4,2));
        System.out.println("Điền Month thành công");
        Thread.sleep(500);
        // Điền Year
        waitUntilElementVisible(textyearfill);
        sendKeys(textyearfill, dataField.getData(5,2));
        System.out.println("Điền Year thành công");
        Thread.sleep(500);
        // Đóng thẻ điền
        waitUntilElementVisible(btnclose);
        btnclose.click();
        Thread.sleep(1000);
        // Log out
        waitUntilElementVisible(btnlogout);
        btnlogout.click();
    }


    @After
    public void tearDown() throws InterruptedException {
        // Tự đóng trình duyệt
        Thread.sleep(1500);
        edriver.close();
    }


}
