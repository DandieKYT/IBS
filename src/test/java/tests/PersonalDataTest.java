package tests;

import org.junit.jupiter.api.Test;

public class PersonalDataTest extends TestBase {
@Test
    public void documentTest(){
    basePage.openPage();
    personalDataPage.buttonWriteUs();
    personalDataPage.openPersonalDataDocument();
    personalDataPage.checkoutDocument();
}

}
