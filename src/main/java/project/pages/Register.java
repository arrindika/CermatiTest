package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.WebDriverInstance;
import project.locators.RegisterLocators;

public class Register {
    public void inputBasic(String input, By locators){
        WebDriverInstance.webdriver.findElement(locators).sendKeys(input);
    }
    public void openPage() {
        WebDriverInstance.webdriver.get("https://www.cermati.com/gabung");
    }
    public void inputEmail(String email) {
        inputBasic(email, RegisterLocators.INPUT_EMAIL);
    }
    public void inputPassword(String password) {
        inputBasic(password, RegisterLocators.INPUT_PASSWORD);
    }
    public void inputConfirmPassword(String password) {
        inputBasic(password, RegisterLocators.INPUT_CONFIRMPASSWORD);
    }
    public void inputFirstName(String name) {
        inputBasic(name, RegisterLocators.INPUT_FIRSTNAME);
    }
    public void inputLastName(String name) {
        inputBasic(name, RegisterLocators.INPUT_LASTNAME);
    }
    public void inputPhoneNumber(String phone) {
        inputBasic(phone, RegisterLocators.INPUT_PHONE);
    }
    public void inputResidenceCity(String city) {
        inputBasic(city, RegisterLocators.INPUT_CITY);
    }
    public void clickRegister() {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverInstance.webdriver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebDriverInstance.webdriver.findElement(RegisterLocators.BUTTON_REGISTER).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 300);
        return wait.until(ExpectedConditions.presenceOfElementLocated(RegisterLocators.TITLE)).isDisplayed();
    }
}
