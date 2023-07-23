package tests;

import org.junit.jupiter.api.Test;

public class SocialGroupTest extends TestBase {
    @Test
    public void VkTelegramTest(){
        basePage.openPage();
        basePage.closeCookie();
        socialGroupPage.vkOpen();
        socialGroupPage.vkCheckout();
        socialGroupPage.telegramOpen();
        socialGroupPage.telegramCheckout();
    }
}
