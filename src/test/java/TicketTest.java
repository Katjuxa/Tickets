import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;

public class TicketTest {
    @Test
    public void ticketTest() {
//    open browser
//    maximize window
        BaseFunc baseFunc = new BaseFunc();
//    goto main page
    baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");
//    choose from
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFrom("RIX");
//       choose to
        homePage.selectTo("MEL");
//    click confirmation button gogogo
        homePage.clickBook();
//    fill the form
//    click get price
//    click confirmation button book
//    choose seat
//    click confirmation button
//    check thank you page
//    close browser
    }





}
