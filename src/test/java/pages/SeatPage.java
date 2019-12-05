package pages;

import org.openqa.selenium.By;
import pages.BaseFunc;

public class SeatPage {
    private BaseFunc baseFunc;
    public final By SEAT= By.xpath(".//div[@onclick='seat(20)']");
    public final By RESULT_SEAT = By.xpath(".//div[@class = 'line']");

    public SeatPage (BaseFunc baseFunc){this.baseFunc = baseFunc;}

    public void ClickSeat () {baseFunc.clickButton(SEAT);}

}
