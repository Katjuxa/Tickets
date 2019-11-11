package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
//    private final By FROM = By.xpath(".//select[@id='afrom']")
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By BOOK = By.xpath(".//span[@class='gogogo']");
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void selectFrom (String airport){
//        find dropdown
//        choose airport
        baseFunc.selectByText(FROM, airport);
    }
//        choose airport to
    public void selectTo (String airport){
        baseFunc.selectByText(TO, airport);
    }
    public void clickBook(){
        baseFunc.clickButton(BOOK);
    }
}
