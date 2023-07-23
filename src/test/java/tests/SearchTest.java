package tests;

import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    @Test
    public void searchMedia(){
        basePage.openPage();
        searchPage.searchButton();
        searchPage.setValue1C();
        searchPage.checkOutResult();
    }
}
