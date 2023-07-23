package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SocialGroupPage {
    private SelenideElement
    vkOpen = $x("//*[contains(@class, 'footer-socials')]/a"),
    vkCheckout = $x("//h1[text()='IBS']"),
    telegramOpen = $x("//*[contains(@class, 'footer-socials')]/a[5]"),
    telegramCheckout = $x("//span[text()='IBS']");

    public SocialGroupPage vkOpen() {
        step("Нажатие на кнопку страницы в ВК", () -> {
            vkOpen.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public SocialGroupPage vkCheckout() {
        step("Проверка названия группы в ВК", () -> {
            vkCheckout.shouldBe(Condition.text("IBS"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }
    public SocialGroupPage telegramOpen() {
        step("Нажатие на кнопку страницы в Telegram", () -> {
            telegramOpen.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public SocialGroupPage telegramCheckout() {
        step("Проверка названия группы в Telegram", () -> {
            telegramCheckout.shouldBe(Condition.text("IBS"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }
}
