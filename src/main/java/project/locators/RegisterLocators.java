package project.locators;

import org.openqa.selenium.By;

public interface RegisterLocators {
    By TITLE = By.xpath("//button[contains(@class,'btn btn-full btn-submit btn-track')]");

    By INPUT_EMAIL = By.id("email");
    By INPUT_PASSWORD = By.id("password");
    By INPUT_CONFIRMPASSWORD = By.id("confirm-password");
    By INPUT_FIRSTNAME = By.id("first-name");
    By INPUT_LASTNAME = By.id("last-name");
    By INPUT_PHONE = By.id("mobile-phone");
    By INPUT_CITY = By.id("residence-city");

    By BUTTON_REGISTER = By.xpath("//button[@class='btn btn-full btn-submit btn-track']");
}
