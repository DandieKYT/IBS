package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class VacationPage {
    private SelenideElement
            openMenu = $(".header-burger > svg > rect:nth-of-type(3)"),
            openCareer = $x("//*[@id='bx_3218110189_5470']"),
            openVacations = $x("//*[contains(@class, 'navigation-lists')]//a[text()='Вакансии']"),
            setValueQA = $x("//*[@id='q']"),
            checkoutResult = $x("//h2[text()='0 вакансий']");


    public VacationPage openMenu() {
        step("Открытие выпадающего меню", () -> {
            openMenu.click();
        });
        return this;
    }
    public VacationPage openCareer() {
        step("Открытие раздела карьера", () -> {
            openCareer.click();
        });
        return this;
    }
    public VacationPage openVacations() {
        step("Открытие вакансий компании", () -> {
            openVacations.click();
        });
        return this;
    }
    public VacationPage setValueQA() {
        step("Введение запроса QA", () -> {
            setValueQA.setValue("QA");
        });
        return this;
    }
    public VacationPage checkoutResult() {
        step("Проверка наличия вакансий QA", () -> {
            checkoutResult.shouldNotBe(Condition.visible);
        });
        return this;
    }
}
