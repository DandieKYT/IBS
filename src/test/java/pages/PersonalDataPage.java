package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class PersonalDataPage {
    private SelenideElement
            buttonWriteUs = $x("//a[text()='Написать нам']"),
            openPersonalDataDocument = $x("//*[contains(@class, 'feedback')]//a[text()='персональных данных']"),
            checkoutDocument = $x("//h1[contains(text(), 'Политика в сфере персональных данных')]");

    public PersonalDataPage buttonWriteUs() {
        step("Нажатие на кнопку Написать нам", () -> {
            buttonWriteUs.click();
        });
        return this;
    }
    public PersonalDataPage openPersonalDataDocument() {
        step("Открытие данных о Политике в сфере персональных данных", () -> {
            openPersonalDataDocument.scrollIntoView(true);
            openPersonalDataDocument.click();
        });
        return this;
    }
    public PersonalDataPage checkoutDocument() {
        step("Проверка содержимого страницы", () -> {
            checkoutDocument.shouldBe(Condition.text("Политика в сфере персональных данных"));
        });
        return this;
    }

}
