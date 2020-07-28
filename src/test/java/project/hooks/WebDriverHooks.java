package project.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.driver.WebDriverInstance;

public class WebDriverHooks {
    @Before(value = "@Web")
    public void initializeWebdriver() {
        WebDriverInstance.initialize();
    }

    @After(value = "@Web")
    public void quitWebdriver(Scenario scenario) {
        if (scenario.isFailed()){
            scenario.embed(((TakesScreenshot) WebDriverInstance.webdriver).getScreenshotAs(OutputType.BYTES), "image/png");
            scenario.write("scenario Fail");
        }
        WebDriverInstance.quit();
    }
}
