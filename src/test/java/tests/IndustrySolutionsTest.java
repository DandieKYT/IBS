package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IndustrySolutionsTest extends TestBase {
    @Tag("controlProgramAndAgroindustry")
    @CsvSource(value = {
            "Решения и услуги  ,      Управление программами",
            "Отраслевые решения,   Агропромышленность" ,

    })
    @Owner("Kudryavtsev")
    @Feature("Управление программами и Агропромышленность")
    @Story("Открытие страниц Управление программами, Агропромышленность и проверка их содержимого")
    @ParameterizedTest
    public void controlProgramAndAgroindustry(String param, String expectedText) {
        basePage.openPage();
        vacationPage.openMenu();
        controlProgramAndAgroindustryPage.openTitle(param);
        controlProgramAndAgroindustryPage.openTitle(expectedText);
        controlProgramAndAgroindustryPage.checkTitle(expectedText);

    }
}
