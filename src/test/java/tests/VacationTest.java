package tests;

import org.junit.jupiter.api.Test;

public class VacationTest extends TestBase{
    @Test
    public void QaTest(){
        basePage.openPage();
        vacationPage.openMenu();
        vacationPage.openCareer();
        vacationPage.openVacations();
        vacationPage.setValueQA();
        vacationPage.checkoutResult();
    }
}
