import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SeatPage;

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
        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        registrationPage.selectNextFlight("11-05-2018");
        registrationPage.fillName("Katjuxa");
        registrationPage.fillSurname("Sunny");
        registrationPage.fillDiscount("lucky");
        registrationPage.fillAdult("2");
        registrationPage.fillChildren("1");
        registrationPage.fillLuggage("3");
//    click get price
        registrationPage.clickPrice();
//    click confirmation button book
        registrationPage.ClickBook();

//    choose seat
        SeatPage seatPage = new SeatPage(baseFunc);
        seatPage.ClickSeat();
//    click confirmation button
        System.out.println("Hello");
//    check thank you page
//    close browser
    }





}
