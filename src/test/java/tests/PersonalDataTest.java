package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class PersonalDataTest extends TestBase {
@Test
@Feature("Проверка документа о персональных данных")
@Story("Открытие страницы об использовании персональных данных и проверка содержимого страницы")
@Owner("Кудрявцев")
    public void documentTest(){
    basePage.openPage();
    personalDataPage.buttonWriteUs();
    personalDataPage.openPersonalDataDocument();
    personalDataPage.checkoutDocument();
}

}
