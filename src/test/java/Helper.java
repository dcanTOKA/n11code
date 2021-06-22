import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Helper extends BaseTest{

    // Yardımcı Fonksiyonlar

    // Elementi Bulur
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public void clickByLintext(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    // Elemente yazi yazar
    public void sendKeys(By by , String text , boolean submit){

        WebElement element = findElement(by);
        element.sendKeys(text);
        if(submit){
            element.submit();
        }

    }
    // Elemente tiklar
    public void click(By by){
        driver.findElement(by).click();
    }
    public String getText(By by){
        return findElement(by).getText();
    }
    public void delay(long time){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Time Unit hatası "+e.getMessage());
        }
    }
    // Value icin secim yapilir
    public void selectByValue(By by, String value){
        select = new Select(findElement(by));
        select.selectByValue(value);
    }
    // N11 Ana sayfası çağırılır.
    public void callHomePage() {
        driver.get("https://www.n11.com/");
    }
    //Elementi temizler
    public void clear(By by){
        driver.findElement(by).clear();
    }

}
