package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
        private BaseFunc baseFunc;

    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By PRICE = By.xpath(".//span[contains(@onclick, 'set')]");
    private final By BOOK = By.id("book2");


    public RegistrationPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void selectNextFlight (String data){
        baseFunc.selectByText(FLIGHT, data);
    }
    public void fillName (String text){
        baseFunc.fillTheForm(NAME, text);
            }
    public void fillSurname(String text) {
      baseFunc.fillTheForm(SURNAME, text);
        }
    public void fillDiscount (String text){
            baseFunc.fillTheForm(DISCOUNT, text);
            }
    public void fillAdult (String text){
        baseFunc.fillTheForm(ADULTS, text);
    }
    public void fillChildren (String text){
        baseFunc.fillTheForm(CHILDREN, text);
        }
    public void fillLuggage (String text){
        baseFunc.fillTheForm(LUGGAGE, text);
    }
    public void clickPrice () {
        baseFunc.clickButton(PRICE);
    }
    public void ClickBook (){
        baseFunc.clickButton(BOOK);
    }
}
