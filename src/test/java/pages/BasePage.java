package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class BasePage {
    private SelenideElement closeCookie = $x("//a[text()='Принять условия']");

    public BasePage openPage() {
        step("Открытие сайта", () -> {
            Selenide.open("/");
        });
        return this;
    }
    public BasePage closeCookie() {
        step("Закрытие куки", () -> {
            closeCookie.click();
        });
        return this;
    }
}
