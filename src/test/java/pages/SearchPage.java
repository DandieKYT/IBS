package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SearchPage {
    private SelenideElement
    searchButton = $x("//*[contains(@class, 'js-header-search')]"),

    setValue1C = $x("//*[@name='q']"),

    checkOutResult =$x("//*[contains(@class, 'search-blocks')]/div[2]/div[2]/div/a/span[2]/span");

    public SearchPage searchButton() {
        step("Нажатие на кнопку поиска", () -> {
            searchButton.click();
        });
        return this;
    }
    public SearchPage setValue1C() {
        step("Введение запроса 1С", () -> {
            setValue1C.setValue("1С").pressEnter();
        });
        return this;
    }
    public SearchPage checkOutResult() {
        step("Проверка наличия результата по запросу 1C", () -> {
            checkOutResult.shouldBe(Condition.text("# Цифровизация"));
        });
        return this;
    }

}
