package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    @Test
    @Feature("Проверка поиска")
    @Story("Ввод в строку поиска \"1С\" и проверка наличия соответствующего результата")
    @Owner("Кудрявцев")
    public void searchMedia(){
        basePage.openPage();
        searchPage.searchButton();
        searchPage.setValue1C();
        searchPage.checkOutResult();
    }
}
