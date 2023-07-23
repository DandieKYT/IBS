package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class VacationTest extends TestBase{
    @Test
    @Feature("Вакансия QA")
    @Story("Открытие страницы Вакансии и проверка наличия вакансии QA")
    @Owner("Кудрявцев")
    public void QaTest(){
        basePage.openPage();
        vacationPage.openMenu();
        vacationPage.openCareer();
        vacationPage.openVacations();
        vacationPage.setValueQA();
        vacationPage.checkoutResult();
    }
}
