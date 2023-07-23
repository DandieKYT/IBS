package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class SocialGroupTest extends TestBase {
    @Test
    @Feature("Открытие ВК и Telegram")
    @Story("Открытие страниц в социальных сетях и проверка их содержимого")
    @Owner("Кудрявцев")
    public void VkTelegramTest(){
        basePage.openPage();
        basePage.closeCookie();
        socialGroupPage.vkOpen();
        socialGroupPage.vkCheckout();
        socialGroupPage.telegramOpen();
        socialGroupPage.telegramCheckout();
    }
}
