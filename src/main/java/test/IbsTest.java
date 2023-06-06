package test;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class IbsTest extends TestBase {
   @Test
    public void contacts(){
    ibsSteps.openPage();
    $x("//a[text()='Принять условия']").click();
    $x("//*[contains(@class, 'header-links')]//a[text()='Контакты']").click();
    $x("//*[contains(@class, 'icons-columns')]/div[2]/div[2]/a[3]").click();
    switchTo().window(1);
    $x("(//a[contains(text(),'Вакансии')])[1]").click();
    $x("//span[contains(text(),'Тестировщик')]").shouldBe(Condition.visible);
    Selenide.closeWindow();
    switchTo().window(0);
    }
    @Test
 public void checkoutNumberPhone() {
    ibsSteps.openPage();
     $x("//*[contains(@class, 'header-links')]//a[text()='Контакты']").click();
     $x("//a[@id='bx_651765591_2402']").click();
     $(byTagAndText("span","+7 (812) 385-15-55")).shouldHave(Condition.text("+7 (812) 385-15-55"));
    }
   @Test
 public void PdfCheck() throws IOException {
    open("https://ibs-training.ru/");
    $x("//div[@class='main-slider__info section-box__content']").click();
    $x("//a[normalize-space()='Java']").click();

   }
}
