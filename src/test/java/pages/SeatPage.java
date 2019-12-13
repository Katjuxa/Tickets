package pages;

import org.openqa.selenium.By;
import pages.BaseFunc;

public class SeatPage {
    private BaseFunc baseFunc;
    public final By SEAT= By.xpath(".//div[@onclick='seat(20)']");
    public final By RESULT_SEAT = By.xpath(".//div[@class = 'line']");
    public final By BOOK = By.id("book3");

    public SeatPage (BaseFunc baseFunc){this.baseFunc = baseFunc;}
    public void WaitSeat () {baseFunc.wait(SEAT);}
    public void ClickSeat () {baseFunc.clickButton(SEAT);}
    public void WaitBook () {baseFunc.wait(BOOK);}
    public void ClickBook () {baseFunc.clickButton(BOOK);}

}
