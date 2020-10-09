import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class N11Page extends  Helper{


    @Test
    public void kayitOlmaVeUrunSepeteEkleme() throws InterruptedException {
        assertEquals("n11.com - Hayat Sana Gelir", getTitle());
        click(By.xpath("//span[text()='Tamam']"));
        clickByLintext("Üye Ol");
        click(By.cssSelector("div.popupFooter a[class='button medium black']"));
        assertEquals("Üye Ol - n11.com",getTitle());
        sendKeys(By.id("firstName"),"Doga",false);
        sendKeys(By.id("lastName"),"Toka",false);
        sendKeys(By.id("registrationEmail"),"candoga01@gmail.com",false);
        sendKeys(By.id("registrationPassword"),"123456",false);
        sendKeys(By.id("passwordAgain"),"123456",false);
        click(By.id("phoneNumber"));
        sendKeys(By.id("phoneNumber"),String.valueOf(545038552),false);

        selectByValue(By.xpath("//select [@id ='birthDay']"),String.valueOf(1));
        selectByValue(By.xpath("//select [@id ='birthMonth']"),String.valueOf(4));
        selectByValue(By.xpath("//select [@id ='birthYear']"),String.valueOf(1997));

        click(By.xpath("//*[@for='genderMale']"));
        click(By.xpath("//*[@for='acceptContract']"));
        callHomePage();
        assertEquals("n11.com - Hayat Sana Gelir", getTitle());
        sendKeys(By.id("searchData"),"Bisiklet",false);
        click(By.xpath("//*[@class='icon iconSearch']"));
        delay(3);
        assertNotNull(By.xpath("//*[contains(@class , 'columnContent ')]"));
        click(By.cssSelector("div.pro [href='https://urun.n11.com/dag-bisikleti/kldoro-kd-025-spor-26-jant-bisiklet-21-vites-kiz-dag-bisikleti-P420191708']"));
        selectByValue(By.xpath("//select [@id='753384139']"),"1-Siyah");
        selectByValue(By.xpath("//select [@id='753384140']"),"1-Standart");
        clear(By.xpath("//*[@id='quantity']"));
        sendKeys(By.xpath("//*[@id='quantity']"),"5",false);
        click(By.cssSelector("div.btnHolder a[title='Sepete Ekle']"));
        delay(4);
    }



}
