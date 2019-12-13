package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "D:/Jekaterina/QAGuru/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:/QA2/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void wait (By locator){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" + url;
        }
        driver.get(url);

    }
    public void selectByText(By locator, String text) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public void clickButton (By locator){
    driver.findElement(locator).click();
    }
    public void fillTheForm (By locator, String text) {
        WebElement inputtext = driver.findElement(locator);
       inputtext.sendKeys(text);
    }

}
